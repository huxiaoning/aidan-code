package org.aidan.sample1;

import java.sql.*;

/**
 * @author Aidan
 * @创建时间：2018/10/13 下午4:18
 * @描述: 代理对象, 代理用户数据对象
 */
public class Proxy implements UserModelApi {

    /**
     * 持有被代理的具体的目标对象
     */
    private UserModel realSubject;


    /**
     * 构造方法，传入被代理的具体的目标对象
     *
     * @param realSubject
     */
    public Proxy(UserModel realSubject) {
        this.realSubject = realSubject;
    }

    /**
     * 标识是否已经重新装载过数据了
     */
    private boolean loaded = false;

    @Override
    public String getUserId() {
        return realSubject.getUserId();
    }

    @Override
    public void setUserId(String userId) {
        realSubject.setUserId(userId);
    }

    @Override
    public String getName() {
        return realSubject.getName();
    }

    @Override
    public void setName(String name) {
        realSubject.setName(name);
    }

    @Override
    public String getDepId() {
        // 需判断是否已经装载过数据
        if (!this.loaded) {
            // 从数据库中重新装载
            reload();
            // 设置重新装载的标志为true
            this.loaded = true;
        }
        return realSubject.getDepId();
    }

    @Override
    public void setDepId(String depId) {
        realSubject.setDepId(depId);
    }

    @Override
    public String getSex() {
        if (!this.loaded) {
            reload();
            this.loaded = true;
        }
        return realSubject.getSex();
    }

    @Override
    public void setSex(String sex) {
        realSubject.setSex(sex);
    }

    /**
     * 重新查询数据库以获取完整的用户数据
     */
    private void reload() {
        System.out.println("重新查询数据库获取完整的用户数据，userId = " + realSubject.getUserId());
        String sql = "select * from tbl_user where userid = ?";
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, realSubject.getUserId());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                // 只需要重新获取除了userId和name外的数据
                realSubject.setDepId(resultSet.getString("DEPID"));
                realSubject.setSex(resultSet.getString("SEX"));
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
