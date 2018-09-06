package org.aidan;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * 测试日期加减
     */
    @Test
    public void test1() {
        Date begin = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(begin);
        calendar.add(Calendar.HOUR_OF_DAY, 2);
        Date end = calendar.getTime();
        System.out.println(begin);
        System.out.println(end);
    }
}
