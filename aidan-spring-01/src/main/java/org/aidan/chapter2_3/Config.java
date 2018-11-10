package org.aidan.chapter2_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Aidan
 * @创建时间：2018/11/10 下午2:00
 * @描述: Config
 */
@Configuration
public class Config {

    @Bean
    public A a() {
        A a = new A();
        System.out.println(a);
        return a;
    }

    @Bean
    public B b(A a) {
        System.out.println(a);
        B b = new B(a);
        return b;
    }
}
