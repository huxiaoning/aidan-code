package org.aidan;

import org.aidan.util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

/**
 * 事务保存点：目的是为了让部分已成功执行的操作提交，后续报异常的操作可以不提时，可以使用事务保存点
 */
public class App {
    public static void main(String[] args) {
        Connection connection = DBUtils.getConnection();
        String sql1 = "INSERT INTO user (id,name,age) VALUES (?,?,?)";
        String sql2 = "INSERT INTO user (id,name,age) VALUES (?,?,?)";
        PreparedStatement preparedStatement1 = null;
        Savepoint savepoint = null;
        PreparedStatement preparedStatement2 = null;

        try {
            /*
            第一个操作 插入一条id为1的数据
             */
            preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.setString(1, "1");
            preparedStatement1.setString(2, "aidan");
            preparedStatement1.setInt(3, 30);
            int i = preparedStatement1.executeUpdate();
            System.out.println("插入了" + i + "条数据。");

            // 定义事务保存点
            savepoint = connection.setSavepoint();

            /*
            第二个操作 插入一条id为1的数据，此时必定报错
             */
            preparedStatement1 = connection.prepareStatement(sql2);
            preparedStatement1.setString(1, "1");
            preparedStatement1.setString(2, "aidan");
            preparedStatement1.setInt(3, 30);
            i = preparedStatement1.executeUpdate();
            System.out.println("插入了" + i + "条数据。");

            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            if (connection != null && savepoint != null) {
                try {
                    connection.rollback(savepoint);
                    connection.commit();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        } finally {
            if (preparedStatement2 != null) {
                try {
                    preparedStatement2.close();
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
