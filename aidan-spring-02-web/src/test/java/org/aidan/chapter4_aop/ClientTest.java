package org.aidan.chapter4_aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Aidan
 * @创建时间：2018/11/11 下午2:18
 * @描述: ClientTest
 */
public class ClientTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"chapter4_aop/XmlConfig.xml"});
        Performance performance = context.getBean(Performance.class);
        performance.perform();
        ((ClassPathXmlApplicationContext) context).close();
    }


    @Test
    public void test2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Performance performance = context.getBean(Performance.class);
        performance.perform();
        ((AnnotationConfigApplicationContext) context).close();
    }
}
