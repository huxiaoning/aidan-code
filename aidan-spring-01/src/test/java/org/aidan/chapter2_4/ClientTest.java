package org.aidan.chapter2_4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Aidan
 * @创建时间：2018/11/10 下午2:18
 * @描述: ClientTest  使用xml完成DI
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:chapter2_4/XmlConfig.xml"})
public class ClientTest {

    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void test1() {
        Assert.assertNotNull(mediaPlayer);
        mediaPlayer.play();
    }
}
