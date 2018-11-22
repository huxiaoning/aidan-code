package org.aidan.chapter4_aop_3_3_paramter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Aidan
 * @创建时间：2018/11/11 下午3:03
 * @描述: TODO
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"org.aidan.chapter4_aop_3_3_paramter"})
public class Config {
}
