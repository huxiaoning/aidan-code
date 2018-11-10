package org.aidan.chapter2_2_1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Aidan
 * @创建时间：2018/11/10 上午10:43
 * @描述: 基于java注解的自动装配
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class JavaConfigClientTest {

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void test1() {

        Assert.assertNotNull(compactDisc);
        compactDisc.play();
    }
}
