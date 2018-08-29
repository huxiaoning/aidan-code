package org.aidan.util;

import org.aidan.config.DBConfig;

import java.sql.*;

public class DBUtils {


    /**
     * 获取数据库连接
     *
     * @return
     * @throws Exception
     */
    public static Connection getConnection() {
        DBConfig config = DBConfig.getInstance();
        String driverClass = config.getProperty("driver");
        String url = config.getProperty("url");
        String user = config.getProperty("user");
        String password = config.getProperty("password");
        Connection connection = null;
        try {
            Class.forName(driverClass);
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


    /**
     * 释放数据库资源
     *
     * @param statement
     * @param connection
     */
    public static void release(Statement statement, Connection connection) {
        if (statement != null) {
            try {
                statement.close();
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

    public static void release(ResultSet resultSet, Statement statement, Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        release(statement, connection);
    }

    public static Integer update(String sql) {
        Integer result = null;
        Connection connection = getConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            result = statement.executeUpdate(sql);
            System.out.println("影响了" + result + "条数据");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            release(statement, connection);
        }
        return result;
    }

    public static void query(String sql) {
        Connection connection = getConnection();
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            release(resultSet, statement, connection);
        }
    }
}
