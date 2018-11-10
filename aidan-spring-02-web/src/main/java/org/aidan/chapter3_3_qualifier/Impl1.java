package org.aidan.chapter3_3_qualifier;

import org.springframework.stereotype.Component;

/**
 * @author Aidan
 * @创建时间：2018/11/10 下午4:55
 * @描述: Impl1
 */
@Component
public class Impl1 implements Api {
    @Override
    public void hello() {
        System.out.println("Impl1");
    }
}
