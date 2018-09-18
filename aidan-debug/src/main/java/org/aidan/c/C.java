package org.aidan.c;

/**
 * @author Aidan
 * @创建时间：2018/9/18 下午6:01
 * @描述: C类
 */
public class C {

    public void c() {
        System.out.println("---------C---------");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTrace) {
            System.out.println(element);
        }
        System.out.println("---------C---------");
    }
}
