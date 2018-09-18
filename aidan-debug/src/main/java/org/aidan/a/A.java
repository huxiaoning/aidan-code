package org.aidan.a;

import org.aidan.b.B;

/**
 * @author Aidan
 * @创建时间：2018/9/18 下午6:01
 * @描述: A类
 */
public class A {
    public void a() {
        System.out.println("---------A---------");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTrace) {
            System.out.println(element);
        }
        System.out.println("---------A---------");
        B b = new B();
        b.b();
    }
}
