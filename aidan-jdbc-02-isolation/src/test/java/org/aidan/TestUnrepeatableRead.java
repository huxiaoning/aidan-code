package org.aidan;

import org.aidan.util.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 测试一下不可重复读:   同一事务两次读取的数据不一致，两次读取中间有其他事务修改并提交了事务
 * 当事务的隔离级别为    读未提交(Read committed)时 会产生不可重复读的问题
 * <p>
 * // * 解决办法：将读写线程的事务隔离级别调成 读已提交或更高级别
 * 操作：在读事务(test1)中的第二次读开始处打断点，先执行读事务 拿到断点后，执行写事务
 * 写事务执行完再放掉读事中的断点 看看两次读的是否一致
 */
public class TestUnrepeatableRead {
    /**
     * 读线程,
     */
    @Test
    public void testRead() {
        String sql = "select a.name from user a where a.id = ?";
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        ResultSet resultSet1 = null;
        ResultSet resultSet2 = null;
        try {
            // 设置事务不自动提交，手动控制事务
            connection.setAutoCommit(false);
            // 设置 事务的隔离级别为读未提交 将会导致脏读
//            connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            // 设置 事务的隔离级别为可重复读 可避免重复读
            connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
            /*
            第一次读
             */
            preparedStatement1 = connection.prepareStatement(sql);
            // 设置sql中的第1个?处的值为1
            preparedStatement1.setInt(1, 1);
            resultSet1 = preparedStatement1.executeQuery();
            while (resultSet1.next()) {
                String name = resultSet1.getString("name");
                System.out.println(name);
            }

            /*
            第二次读
             */
            preparedStatement2 = connection.prepareStatement(sql);
            // 设置sql中的第1个?处的值为1
            preparedStatement2.setInt(1, 1);
            resultSet2 = preparedStatement2.executeQuery();
            while (resultSet2.next()) {
                String name = resultSet2.getString("name");
                System.out.println(name);
            }
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
        String sql = "update user set name = 'aidan被修改了' where id = ?";
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            // 设置事务不自动提交，手动控制事务
            connection.setAutoCommit(false);
            // 设置 事务的隔离级别为读未提交 将会导致脏读
            connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            preparedStatement = connection.prepareStatement(sql);
            // 设置sql中的第1个?处的值为1
            preparedStatement.setInt(1, 1);
            int i = preparedStatement.executeUpdate();
            System.out.println("更新了" + i + "条数据");
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
