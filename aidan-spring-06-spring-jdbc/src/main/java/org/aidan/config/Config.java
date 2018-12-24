package org.aidan.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.logging.Slf4jLogFilter;
import com.alibaba.druid.pool.DruidDataSource;
import org.aidan.constant.Constants;
import org.springframework.beans.factory.config.PreferencesPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

/**
 * @author Aidan
 * @创建时间：2018/11/26 9:51 AM
 * @描述: Config
 */
@Configuration
@ComponentScan(basePackages = "org.aidan")
public class Config {

    @Bean
    public Properties properties() {
        String configRootPath = System.getenv(Constants.CONFIG_ROOT_PATH);
        if (!configRootPath.endsWith(File.separator)) {
            configRootPath += File.separator;
        }
        String propertiesFilePath = configRootPath + Constants.CONFIG_FILE_NAME;
        File propertiesFile = new File(propertiesFilePath);
        if (!propertiesFile.exists()) {
            throw new RuntimeException("配置文件" + propertiesFilePath + "不存在！");
        }
        Properties properties = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(propertiesFile);
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return properties;
    }

    @Bean
    public PreferencesPlaceholderConfigurer configurer(Properties properties) {
        PreferencesPlaceholderConfigurer configurer = new PreferencesPlaceholderConfigurer();
        configurer.setProperties(properties);
        return configurer;
    }


    @Bean
    public Filter logFilter() {
        Slf4jLogFilter logFilter = new Slf4jLogFilter();
        logFilter.setStatementExecutableSqlLogEnable(false);
        return logFilter;
    }

}
