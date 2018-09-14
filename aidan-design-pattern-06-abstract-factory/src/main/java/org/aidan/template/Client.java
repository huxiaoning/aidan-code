package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/9/14 下午3:36
 * @描述: 客户端
 */
public class Client {

    public static void main(String[] args) {
        // 创建抽象工厂对象
        AbstractFactory factory = new ConcreteFactory1();
        // 通过抽象工厂来获取一系列的对象，如产品A和产品B
        factory.createProductA();
        factory.createProductB();
    }

}
