package org.aidan;

import org.aidan.util.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test() {
        Connection connection = DBUtils.getConnection();
        try {
            int transactionIsolation = connection.getTransactionIsolation();
            System.out.println(transactionIsolation); // 4 TRANSACTION_REPEATABLE_READ mysql默认隔离级别是可重复读
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
