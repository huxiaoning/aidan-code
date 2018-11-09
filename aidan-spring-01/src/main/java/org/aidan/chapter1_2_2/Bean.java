package org.aidan.chapter1_2_2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Aidan
 * @创建时间：2018/11/9 下午5:25
 * @描述: spring bean 研究其生命周期
 */
public class Bean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor, InitializingBean, DisposableBean {

    private static BeanFactory beanFactory;
    private static ApplicationContext applicationContext;

    private String value;

    private String beanName;

    public Bean() {
        System.out.println("1 构造器");
    }

    public void init() {
        System.out.println("init");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        System.out.println("2 注入依赖");
    }


    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("3 BeanNameAware接口setBeanName方法");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        Bean.beanFactory = beanFactory;
        System.out.println("4 BeanFactoryAware接口setBeanFactory方法");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Bean.applicationContext = applicationContext;
        System.out.println("5 ApplicationContextAware接口setApplicationContext方法");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("6 BeanPostProcessor 接口 postProcessBeforeInitialization 方法");
        return bean;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("7 InitializingBean 接口 afterPropertiesSet 方法");
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("8 BeanPostProcessor 接口 postProcessAfterInitialization 方法");
        return bean;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("10 DisposableBean 接口 destroy 方法");
    }


    public void test() {
        System.out.println("测试Bean的生命周期");
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        System.out.println("9 Bean已经准备就绪");
        Bean bean = context.getBean(Bean.class);
        bean.test();
        System.out.println(Bean.applicationContext);
        System.out.println(Bean.beanFactory);
        context.close();
    }


}
