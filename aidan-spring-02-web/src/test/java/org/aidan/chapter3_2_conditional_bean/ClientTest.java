package org.aidan.chapter3_2_conditional_bean;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Aidan
 * @创建时间：2018/11/10 下午4:11
 * @描述: ClientTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
@ActiveProfiles("dev")
public class ClientTest {

    @Autowired(required = false)
    private MagicBean magicBean;

    @Test
    public void test() {
        Assert.assertNotNull(magicBean);
    }
}
