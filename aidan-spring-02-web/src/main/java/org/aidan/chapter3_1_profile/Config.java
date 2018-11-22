package org.aidan.chapter3_1_profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Aidan
 * @创建时间：2018/11/11 上午9:31
 * @描述: Config
 */
@Configuration
public class Config {
    @Bean
    @Profile("dev")
    public String string() {
        return new String("Hello World!");
    }
}
