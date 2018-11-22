package org.aidan.chapter3_5_runtime_value;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

/**
 * @author Aidan
 * @创建时间：2018/11/10 下午5:29
 * @描述: ClientTest
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
public class ClientTest {

    @Autowired
    private BlankDisc blankDisc;

    @Autowired
    private Environment env;

    @Test
    public void test() {
        String[] activeProfiles = env.getActiveProfiles();
        System.out.println(Arrays.asList(activeProfiles));
        Assert.assertNotNull(blankDisc);
        System.out.println(blankDisc.getTitle());
        System.out.println(blankDisc.getArtist());
    }
}
