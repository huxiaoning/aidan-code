package org.aidan;

import org.aidan.util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //  向数据库表user批量插入10万条数据
        int sum = 100000;
        Connection connection = DBUtils.getConnection();
        long start = System.currentTimeMillis();
        PreparedStatement preparedStatement = null;
        try {
            connection.setAutoCommit(false);
            for (int i = 1; i <= sum; i++) {
                String sql = "INSERT INTO user (id,name,age) VALUES (?,?,?)";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, "Aidan" + i);
                preparedStatement.setInt(3, 30);
                preparedStatement.addBatch();
                // 每30条批量发送执行一次
                if (i % 30 == 0) {
                    preparedStatement.executeBatch();
                    preparedStatement.clearBatch();
                }
            }
            // 如果总数不是30的倍数，最后还要再批量发送执行一次
            if (sum % 30 != 0) {
                preparedStatement.executeBatch();
                preparedStatement.clearBatch();
            }
            connection.commit();
            long end = System.currentTimeMillis();
            System.out.println("耗时：" + (end - start) + "毫秒!");
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            DBUtils.release(preparedStatement, connection);
        }
    }
}
