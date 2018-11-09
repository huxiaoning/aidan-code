package org.aidan.chapter1_1_2.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @author Aidan
 * @创建时间：2018/11/9 下午3:29
 * @描述: TODO
 */
@Component
public class ConfigProperties {

    @Autowired
    private Properties properties;


    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
