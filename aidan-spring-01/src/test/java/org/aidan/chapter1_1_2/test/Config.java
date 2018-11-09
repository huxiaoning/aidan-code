package org.aidan.chapter1_1_2.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PreferencesPlaceholderConfigurer;
import org.springframework.context.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Aidan
 * @创建时间：2018/11/9 下午2:58
 * @描述: spring java config
 */

@Configuration
@PropertySource("")
@ComponentScan("org.aidan.chapter1_1_2.test")
public class Config {

    @Bean("properties")
    public Properties properties() {
        String configRootPath = System.getenv("configRootPath");
        if (!configRootPath.endsWith(File.separator)) {
            configRootPath += File.separator;
        }
        String propertiesFilePath = configRootPath + "eco_dev.properties";
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
    public Comm comm() {
        return new Comm();
    }


    @Bean
    public A a() {
        A a = new A();
        System.out.println(a);
        return a;
    }

    @Bean
    public A a1(@Value("${domain}") String domain) {
        System.out.println(domain);
        A a = new A();
        System.out.println(a);
        return a;
    }

    /**
     * 通过变量名来识别具体ref哪一个A
     *
     * @param a1 使用a1()方法注入的这个A类型的bean
     * @return
     */
    @Bean
    public B b(A a1) {
        System.out.println(a1);
        return new B(a1);
    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Comm comm = context.getBean(Comm.class);
        comm.hello();

        ConfigProperties configProperties = context.getBean(ConfigProperties.class);
        String experience_upload_path = configProperties.getProperty("experience_upload_path");
        System.out.println(experience_upload_path);


        B b = context.getBean(B.class);
        System.out.println(b);


        PreferencesPlaceholderConfigurer properties = context.getBean(PreferencesPlaceholderConfigurer.class);
        context.close();

    }
}
