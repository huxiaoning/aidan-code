package org.aidan;

import org.aidan.util.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test1() {
        Connection connection = DBUtils.getConnection();
        try {
            DatabaseMetaData metaData = connection.getMetaData();
            String databaseProductName = metaData.getDatabaseProductName();
            System.out.println("DBName = " + databaseProductName);
            System.out.println("支持的数据库事务:" + metaData.supportsTransactions());
            System.out.println("支持的数据库事务隔离级别 -- 串行化:" + metaData.supportsTransactionIsolationLevel(Connection.TRANSACTION_SERIALIZABLE));
            System.out.println("支持的数据库事务隔离级别 -- 可重复读:" + metaData.supportsTransactionIsolationLevel(Connection.TRANSACTION_REPEATABLE_READ));
            System.out.println("支持的数据库事务隔离级别 -- 读已提交:" + metaData.supportsTransactionIsolationLevel(Connection.TRANSACTION_READ_COMMITTED));
            System.out.println("支持的数据库事务隔离级别 -- 读未提交:" + metaData.supportsTransactionIsolationLevel(Connection.TRANSACTION_READ_UNCOMMITTED));
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
