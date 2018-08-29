package org.aidan.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取应用配置文件
 * 单例实现
 */
public class AppConfig {
    /**
     * 定义一个变量来存储创建好的类实例
     */
    private static volatile AppConfig appConfig = null;

    /**
     * 构造器私有化
     */
    private AppConfig() {
        readProperties();
    }

    /**
     * 暴露获取实例的静态方法
     */
    public static AppConfig getInstance() {
        if (appConfig == null) {
            synchronized (AppConfig.class) {
                if (appConfig == null) {
                    appConfig = new AppConfig();
                }
            }
        }
        return appConfig;
    }


    private Properties properties;

    private void readProperties() {
        properties = new Properties();
        InputStream in = AppConfig.class.getClassLoader().getResourceAsStream("app.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            System.out.println("装载配置文件出错，具体堆栈信息如下：");
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

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

}
