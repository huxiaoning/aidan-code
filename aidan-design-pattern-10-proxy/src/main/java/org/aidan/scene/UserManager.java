package org.aidan.scene;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Aidan
 * @创建时间：2018/10/13 下午2:53
 * @描述: 实现示例需要的功能
 */
public class UserManager {

    public Collection<UserModel> getUserByDepId(String depId) {
        Collection<UserModel> col = new ArrayList<>();
        Connection connection = this.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM TBL_USER U,TBL_DEP D WHERE U.DEPID = D.DEPID AND D.DEPID LIKE ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, depId + '%');
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                UserModel userModel = new UserModel();
                userModel.setUserId(resultSet.getString("USERID"));
                userModel.setName(resultSet.getString("NAME"));
                userModel.setDepId(resultSet.getString("DEPID"));
                userModel.setSex(resultSet.getString("SEX"));
                col.add(userModel);
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
