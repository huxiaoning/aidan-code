package org.aidan.b;

import org.aidan.c.C;

/**
 * @author Aidan
 * @创建时间：2018/9/18 下午6:01
 * @描述: B类
 */
public class B {
    public void b() {
        System.out.println("---------B---------");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTrace) {
            System.out.println(element);
        }
        System.out.println("---------B---------");
        C c = new C();
        c.c();
    }
}
