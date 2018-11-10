package org.aidan.chapter2_2_1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Aidan
 * @创建时间：2018/11/10 上午10:48
 * @描述: 基于xml配置java注解的自动装配
 * <p>
 * classpath 与 classpath*的区别
 * https://www.cnblogs.com/EasonJim/p/6709314.html
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:chapter2_2_1/CDPlayerConfig.xml"})
public class XmlConfigClientTest {

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void test1() {

        Assert.assertNotNull(compactDisc);
        compactDisc.play();
    }
}
