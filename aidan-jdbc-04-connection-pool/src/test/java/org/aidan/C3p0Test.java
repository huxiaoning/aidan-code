package org.aidan;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.aidan.config.DBConfig;
import org.junit.Test;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class C3p0Test {

    @Test
    public void testQuickStart() {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        DBConfig config = DBConfig.getInstance();
        try {
            cpds.setDriverClass(config.getProperty("driver")); //loads the jdbc driver
            cpds.setJdbcUrl(config.getProperty("url"));
            cpds.setUser(config.getProperty("user"));
            cpds.setPassword(config.getProperty("password"));

            cpds.setMaxStatements(180);

            Connection connection = cpds.getConnection();

            System.out.println(connection);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            cpds.close();
        }

    }

    @Test
    public void testWithXmlConfig() {
        DataSource helloC3p0 = new ComboPooledDataSource("helloC3p0");

        try {
            Connection connection = helloC3p0.getConnection();
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
