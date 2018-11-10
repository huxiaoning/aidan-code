package org.aidan.chapter3_5_runtime_value;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author Aidan
 * @创建时间：2018/11/10 下午5:23
 * @描述: Config
 */
@Configuration
//@PropertySource(value = "classpath:/app.properties")
@PropertySource(value = "file:/Users/aidan/app.properties")
public class Config {

    private static String propertiesPath = "file:/Users/aidan/IdeaProjects/eco/ecoconfig/eco_dev.properties";

    @Autowired
    private Environment environment;


    @Bean
    public BlankDisc blankDisc() {
        return new BlankDisc(environment.getProperty("disc.title"), environment.getProperty("disc.artist"));
    }
}
