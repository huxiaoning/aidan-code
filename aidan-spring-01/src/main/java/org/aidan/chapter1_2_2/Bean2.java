package org.aidan.chapter1_2_2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Aidan
 * @创建时间：2018/11/9 下午6:33
 * @描述: Bean2
 */
public class Bean2 implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean2 postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean2 postProcessAfterInitialization");
        return bean;
    }
}
