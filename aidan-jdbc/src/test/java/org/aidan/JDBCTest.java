package org.aidan;

import org.junit.Test;

import java.sql.*;

public class JDBCTest {

    @Test
    public void testStatement() {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = JDBCTools.getConnection();
            String insert = "INSERT INTO customers (name,email,birth) VALUES('aidan','huxiaoningsworld@sina.com','1987-10-30');";
            statement = connection.createStatement();
            int i = statement.executeUpdate(insert);
            System.out.println("影响了" + i + "条数据!");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTools.release(statement, connection);
        }
    }

    @Test
    public void testResultSet() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCTools.getConnection();
            String select = "select * from customers where id = 4";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(select);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("EMAIL");
                Date birth = resultSet.getDate("birth");
                System.out.println(id);
                System.out.println(name);
                System.out.println(email);
                System.out.println(birth);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTools.release(resultSet, statement, connection);
        }
    }

}
