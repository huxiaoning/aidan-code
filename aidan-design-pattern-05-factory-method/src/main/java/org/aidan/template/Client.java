package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/9/7 上午10:00
 * @描述: 测试Factory Method的客户端
 */
public class Client {

    public static void main(String[] args) {
        Creator concreteCreator = new ConcreteCreator();
        concreteCreator.someOperation();
    }
}
