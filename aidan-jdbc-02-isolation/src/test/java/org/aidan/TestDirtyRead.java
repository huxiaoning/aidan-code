package org.aidan;

import org.aidan.util.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 测试一下脏读:  读到其他事务未提交的更改
 * 当事务的隔离级别为    读未提交(Read uncommitted)时 会产生脏读的问题
 * <p>
 * 解决办法：将读写线程的事务隔离级别调成 读已提交或更高级别
 */
public class TestDirtyRead {

    /**
     * 读线程,
     */
    @Test
    public void testRead() {
        String sql = "select a.name from user a where a.id = ?";
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            // 设置 事务的隔离级别为读未提交 将会导致脏读
//            connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
            //设置 事务的隔离级别为读已提交 可以避免脏读
            connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            preparedStatement = connection.prepareStatement(sql);
            // 设置sql中的第1个?处的值为1
            preparedStatement.setInt(1, 1);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                System.out.println(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
            connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
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
