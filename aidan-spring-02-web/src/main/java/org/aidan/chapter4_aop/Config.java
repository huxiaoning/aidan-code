package org.aidan.chapter4_aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Aidan
 * @创建时间：2018/11/11 下午2:11
 * @描述: Config
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"org.aidan.chapter4_aop"})
public class Config {

}
