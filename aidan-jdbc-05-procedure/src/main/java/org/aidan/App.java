package org.aidan;

import org.aidan.util.DBUtils;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

/**
 * jdbcy调用存储过程
 */
public class App {
    public static void main(String[] args) {

        String sql = "CALL removeUserByName(?,?)";
        Connection connection = DBUtils.getConnection();
        CallableStatement callableStatement = null;
        try {
            callableStatement = connection.prepareCall(sql);
            // 第二个参数为OUT类型参数 需要注册类型
            callableStatement.registerOutParameter(2, Types.NUMERIC);
            // 第一个参数为IN类型参数，需要赋值
            callableStatement.setString(1, "aidan");

            // 执行存储过程
            callableStatement.execute();

            // 获取返回的OUT类型参数
            int count = callableStatement.getInt(2);
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.release(callableStatement, connection);
        }
    }
}
