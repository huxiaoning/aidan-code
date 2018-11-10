package org.aidan.chapter3_2_conditional_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Aidan
 * @创建时间：2018/11/10 下午4:08
 * @描述: Config
 */
@Configuration
public class Config {

    @Bean
    @Conditional(MagicExistsCondition.class)
    @Profile("dev")
    public MagicBean magicBean() {
        return new MagicBean();
    }
}
