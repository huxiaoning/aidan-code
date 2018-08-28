package org.aidan;

import org.aidan.factory.Api;
import org.aidan.factory.Factory;

/**
 * 可配置的简单工厂方案
 */
public class Client {

    public static void main(String[] args) {
        Api api = Factory.createApi();
        api.test1("哈哈，只是一个测试而已。");
        System.out.println(api.getClass());
    }
}
