package org.aidan.chapter4_aop_3_4;

import org.springframework.stereotype.Component;

/**
 * @author Aidan
 * @创建时间：2018/11/11 下午3:35
 * @描述: DemoService
 */
@Component
public class DemoService {

    public Integer hello(String name) {
        System.out.println("hello " + name + "!");
        return 100;
    }
}
