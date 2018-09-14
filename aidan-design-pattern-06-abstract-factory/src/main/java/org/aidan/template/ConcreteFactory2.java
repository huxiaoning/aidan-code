package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/9/14 下午3:33
 * @描述: 具体的工厂实现对象2, 实现创建具体的产品对象的操作
 */
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
