package org.aidan.chapter4_aop_3_3_paramter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Aidan
 * @创建时间：2018/11/11 下午3:10
 * @描述: ClientTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
public class ClientTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void test() {
        demoService.hello("Spring");
    }
}
