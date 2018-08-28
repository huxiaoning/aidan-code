package org.aidan.factory;

/**
 * 不使用模式的解决方案
 */
public class Client {

    public static void main(String[] args) {
        Api api = new ImplA();
        api.test1("哈哈不要紧张，只是个测试而已！");
    }
}
