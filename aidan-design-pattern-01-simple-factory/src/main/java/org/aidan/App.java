package org.aidan;

import org.aidan.factory.Api;
import org.aidan.factory.Factory;

/**
 * 使用简单工厂方法模式的解决方案
 */
public class App {
    public static void main(String[] args) {
        Api api = Factory.createApi(1);
        api.test1("哈哈不要紧张，只是个测试而已！");
        System.out.println(api.getClass());
    }
}
