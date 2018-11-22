package org.aidan.chapter4_aop_3_4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Aidan
 * @创建时间：2018/11/11 下午3:36
 * @描述: ClientTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
public class ClientTest {

    @Autowired
    private DemoService demoService;

    @Autowired
    private Walk walk;


    @Autowired
    private ApplicationContext context;


    /**
     * walk的beanID和demoService一样哈，是同一个bean,同一个对象，这就是为已经存在的bean添加新的功能，通过AOP.
     */

    @Test
    public void test() {
//        Integer world = demoService.hello("world");
//        System.out.println("返回：" + world);
//        walk.walk();
        DemoService demoService = (DemoService) context.getBean("demoService");
        Walk walk = (Walk) context.getBean("demoService");

        demoService.hello("world");
        walk.walk();


        System.out.println(demoService == walk);

        System.out.println(context.getBean(Walk.class) == context.getBean(DemoService.class));
    }
}
