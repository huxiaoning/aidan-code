package org.aidan.chapter1_1_2.test;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Aidan
 * @创建时间：2018/11/9 下午2:59
 * @描述: TODO
 */
public class Comm {

    @Value("${domain}")
    private String domain;

    public void hello() {
        System.out.println("hello " + domain);
    }
}
