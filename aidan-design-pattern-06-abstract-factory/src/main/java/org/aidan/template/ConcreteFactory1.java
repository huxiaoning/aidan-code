package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/9/14 下午3:28
 * @描述: 具体的工厂实现对象1, 实现创建具体的产品对象的操作
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
