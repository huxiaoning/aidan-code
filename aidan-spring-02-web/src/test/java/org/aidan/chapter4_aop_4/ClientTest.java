package org.aidan.chapter4_aop_4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Aidan
 * @创建时间：2018/11/11 下午4:17
 * @描述: ClientTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:chapter4_aop_4/XmlConfig.xml"})
public class ClientTest {

    @Autowired
    private AddService addService;

    @Autowired
    private ApplicationContext context;

    @Test
    public void test() {
        int result = addService.add(1, 3);
        System.out.println("result = " + result);
        int sub = ((SubService) addService).sub(5, 2);
        System.out.println("sub = " + sub);
    }
}
