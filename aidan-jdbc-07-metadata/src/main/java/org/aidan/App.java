package org.aidan;

import org.aidan.util.DBUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String sql = "SELECT id,name,age FROM user WHERE id = ?";
        Object[] params = new Object[]{"1"};
        List<Map<String, Object>> userList = read(sql, params);
        System.out.println(userList);
    }


    public static List<Map<String, Object>> read(String sql, Object[] params) {
        List<Map<String, Object>> userList = new ArrayList<>();
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            ParameterMetaData parameterMetaData = preparedStatement.getParameterMetaData();
            int parameterCount = parameterMetaData.getParameterCount();
            for (int i = 1; i <= parameterCount; i++) {
//                System.out.println(parameterMetaData.getParameterClassName(i));
//                System.out.println(parameterMetaData.getParameterType(i));
//                System.out.println(parameterMetaData.getParameterTypeName(i));
                preparedStatement.setObject(i, params[i - 1]);
            }
            ResultSet resultSet = preparedStatement.executeQuery();

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (resultSet.next()) {
//                System.out.print(resultSet.getString("id") + "\t");
//                System.out.print(resultSet.getString("name") + "\t");
//                System.out.println(resultSet.getInt("age"));
                Map<String, Object> user = new HashMap<>();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object columnValue = resultSet.getObject(columnName);
                    user.put(columnName, columnValue);
                }
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.release(preparedStatement, connection);
        }

        return userList;
    }
}
