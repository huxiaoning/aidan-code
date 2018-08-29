package org.aidan;

/**
 * 已经存在的接口，这个接口需要被适配
 */
public class Adaptee {

    public void specificRequest() {
        System.out.println("具体的功能处理");
    }
}
