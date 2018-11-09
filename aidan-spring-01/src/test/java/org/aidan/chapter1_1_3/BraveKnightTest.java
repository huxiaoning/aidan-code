package org.aidan.chapter1_1_3;

import org.aidan.chapter1_1_2.Knight;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Aidan
 * @创建时间：2018/11/9 上午11:00
 * @描述: BraveKnightTest
 */
public class BraveKnightTest {

    /**
     * 测试基于xml配置的aop
     */
    @Test
    public void springXmlConfig() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights1.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
