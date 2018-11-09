package org.aidan.chapter1_1_2;

import org.aidan.chapter1_1_2.javaConfig.KnightConfig;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Aidan
 * @创建时间：2018/11/9 上午11:00
 * @描述: BraveKnightTest
 */
public class BraveKnightTest {

    /**
     * 第一步javaBean解耦依赖关系
     * Mock测试 解耦依赖关系后的javaBean
     */
    @Test
    public void knightShouldEmbarkOnQuest() {
        // 用Mock创建Quest实例(其实是个代理类的实例)
        Quest mockQuest = Mockito.mock(Quest.class);
        Knight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        // 验证Mock实例mockQuest的embark接口被调用了1次，不报异常就算通过测试
        Mockito.verify(mockQuest, Mockito.times(1)).embark();
    }

    /**
     * 第二步 使用Spring Ioc容器管理javaBean及javaBean之间的依赖关系
     * spring xml配置
     */
    @Test
    public void springXmlConfig() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

    /**
     * 第二步 使用Spring Ioc容器管理javaBean及javaBean之间的依赖关系
     * spring java配置
     */
    @Test
    public void springJavaConfig() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
