package org.aidan;


import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class TestConnection {

    public static void main(String[] args) throws Exception {
        Connection connection = getConnection3();
        System.out.println(connection);

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from user");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            System.out.println(id);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }


    /**
     * 用Driver来获取连接
     *
     * @return
     * @throws SQLException
     * @throws IOException
     */
    public static Connection getConnection() throws SQLException, IOException {

        Properties properties = new Properties();
        properties.load(TestConnection.class.getClassLoader().getResourceAsStream("jdbc.properties"));
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        Properties info = new Properties();
        info.put("user", user);
        info.put("password", password);

        Driver driver = new com.mysql.jdbc.Driver();
        Connection connect = driver.connect(url, info);
        return connect;
    }

    /**
     * 用Driver获取连接改进
     */
    public static Connection getConnection2() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Properties properties = new Properties();
        properties.load(TestConnection.class.getClassLoader().getResourceAsStream("jdbc.properties"));
        String driverClass = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");


        Properties info = new Properties();
        info.put("user", user);
        info.put("password", password);

        Driver driver = (Driver) Class.forName(driverClass).newInstance();
        Connection connect = driver.connect(url, info);
        return connect;
    }


    /**
     * 使用DriverManager 获取连接
     */
    public static Connection getConnection3() throws Exception {
        Properties properties = new Properties();
        properties.load(TestConnection.class.getClassLoader().getResourceAsStream("jdbc.properties"));
        String driverClass = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

//        DriverManager.registerDriver((Driver) Class.forName(driverClass).newInstance());
        Class.forName(driverClass);
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

}
