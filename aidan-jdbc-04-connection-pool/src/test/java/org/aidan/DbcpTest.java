package org.aidan;

import org.aidan.config.DBConfig;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DbcpTest {

    @Test
    public void testDbcp1() {
        BasicDataSource dataSource = new BasicDataSource();
        DBConfig config = DBConfig.getInstance();
        dataSource.setDriverClassName(config.getProperty("driver"));
        dataSource.setUrl(config.getProperty("url"));
        dataSource.setUsername(config.getProperty("user"));
        dataSource.setPassword(config.getProperty("password"));

        // 初始化连接数
        dataSource.setInitialSize(5);
        // 最小空闲连接
        dataSource.setMinIdle(5);
        // 最大空闲连接
        dataSource.setMaxIdle(10);
        // 最大连接数量
        dataSource.setMaxActive(15);
        // 是否自动回收超时连接
        dataSource.setRemoveAbandoned(true);
        // 超时时间(以秒数为单位)
        dataSource.setRemoveAbandonedTimeout(180);
        //  超时等待时间以毫秒为单位 6000毫秒/1000等于60秒
        dataSource.setMaxWait(3000);
        // 在空闲连接回收器执行周期(毫秒)
        dataSource.setTimeBetweenEvictionRunsMillis(10000);
        // 在每次空闲连接回收器线程(如果有)运行时检查的连接数量
        dataSource.setNumTestsPerEvictionRun(10);
        // 最小空闲时间
        dataSource.setMinEvictableIdleTimeMillis(10000);
        // 验证链接是否有效的sql语句
        dataSource.setValidationQuery("select 1");
        // 获取链接之前是否测试链接的可用性
        dataSource.setTestOnBorrow(true);

        try {
            Connection connection = dataSource.getConnection();
            System.out.println(connection.getClass());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDbcp2() {
        Properties properties = new Properties();
        InputStream in = DbcpTest.class.getClassLoader().getResourceAsStream("dbcp.properties");
        try {
            properties.load(in);
            DataSource dataSource = BasicDataSourceFactory.createDataSource(properties);
            Connection connection = dataSource.getConnection();
            System.out.println(connection);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
