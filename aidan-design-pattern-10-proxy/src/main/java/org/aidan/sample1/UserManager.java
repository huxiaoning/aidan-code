package org.aidan.sample1;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Aidan
 * @创建时间：2018/10/13 下午4:52
 * @描述: 实现示例需要的功能
 */
public class UserManager {

    public Collection<UserModelApi> getUserByDepId(String depId) {
        Collection<UserModelApi> col = new ArrayList<>();
        String sql = "select u.userId,u.name from tbl_user u,tbl_dep d where u.depId = d.depId and d.depid like ?";
        Connection connection = this.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, depId + "%");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                // 这里是创建代理对象，而不是直接创建UserModel对象
                Proxy proxy = new Proxy(new UserModel());
                // 只要设置userId和name两个字段就可以了
                proxy.setUserId(resultSet.getString("USERID"));
                proxy.setName(resultSet.getString("NAME"));
                col.add(proxy);
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

        return col;
    }

    private Connection getConnection() {

        String driverClass = "oracle.jdbc.driver.OracleDriver";
        String jdbcUrl = "jdbc:oracle:thin:@localhost:49161:xe";
        String user = "system";
        String password = "root";

        Connection connection = null;
        try {
            Class.forName(driverClass);
            connection = DriverManager.getConnection(jdbcUrl, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
