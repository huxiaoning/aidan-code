package org.aidan.chapter2_2_2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Aidan
 * @创建时间：2018/11/10 上午11:11
 * @描述: AutowiredTest
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class AutowiredTest {

    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void test() {
        Assert.assertNotNull(mediaPlayer);
        mediaPlayer.play();
    }
}
