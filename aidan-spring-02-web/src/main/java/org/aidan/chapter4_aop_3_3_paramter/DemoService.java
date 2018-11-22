package org.aidan.chapter4_aop_3_3_paramter;

import org.springframework.stereotype.Component;

/**
 * @author Aidan
 * @创建时间：2018/11/11 下午3:05
 * @描述: DemoService
 */
@Component
public class DemoService {

    public void hello(String name) {
        System.out.println("Hello " + name + "!");
    }
}
