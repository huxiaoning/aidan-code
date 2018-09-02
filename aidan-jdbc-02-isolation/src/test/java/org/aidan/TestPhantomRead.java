package org.aidan;

import org.aidan.util.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 测试一下幻读: A事务更新表中所有的name字段为aidan 然后读取所有的name字段，发现有一个没有被修改成aidan。A事务写与读期间有B事务插入了新的数据
 * 产生原因：当事务隔离级别为 可重复读(Repeatable Read)或以下时，会产生幻读的问题
 * <p>
 * * // * 解决办法：将读写线程的事务隔离级别调成 串行化
 * * 操作：在读事务(test1)中的第二次读开始处打断点，先执行读事务 拿到断点后，执行写事务
 * * 写事务执行完再放掉读事中的断点 看看两次读的是否一致
 */
public class TestPhantomRead {
    /**
     * 读线程,
     */
    @Test
    public void testRead() {
        String sql = "select count(id) count from user where id > 1";
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        ResultSet resultSet1 = null;
        ResultSet resultSet2 = null;
        try {
            // 设置事务不自动提交，手动控制事务
            connection.setAutoCommit(false);
            // 设置 事务的隔离级别为读未提交 将会导致脏读
            connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
            // 设置 事务的隔离级别为可重复读 可避免重复读
//            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            /*
            第一次:读id>1的记录有几条
             */
            preparedStatement1 = connection.prepareStatement(sql);
            // 设置sql中的第1个?处的值为1
            resultSet1 = preparedStatement1.executeQuery();
            while (resultSet1.next()) {
                int count = resultSet1.getInt("count");
                System.out.println("id大于1的记录有" + count + "条。");
            }


            /*
            第二次写
             */
            sql = "insert into user (id,name,age) values (2,'JACK',36)";
            preparedStatement2 = connection.prepareStatement(sql);
            // 设置sql中的第1个?处的值为1
            int result = preparedStatement2.executeUpdate();
            System.out.println("插入了" + result + "条数据。");
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            if (resultSet1 != null) {
                try {
                    resultSet1.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (resultSet2 != null) {
                try {
                    resultSet2.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement1 != null) {
                try {
                    preparedStatement1.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement2 != null) {
                try {
                    preparedStatement2.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 写线程,注意在提交事务处打个断点，看看未提交的事务中修改的数据能否被上面的读线程读到
     */
    @Test
    public void testWrite() {
        String sql = "insert into user (id,name,age) values (2,'jack',25)";
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            // 设置事务不自动提交，手动控制事务
            connection.setAutoCommit(false);
            // 设置 事务的隔离级别为读未提交 将会导致脏读
            connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
            preparedStatement = connection.prepareStatement(sql);
            // 设置sql中的第1个?处的值为1
            int i = preparedStatement.executeUpdate();
            System.out.println("插入了" + i + "条数据");
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
