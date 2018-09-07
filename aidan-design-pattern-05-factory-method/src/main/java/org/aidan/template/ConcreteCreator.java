package org.aidan.template;

/**
 * @author 具体的创建器实现
 * @创建时间：2018/9/7 上午9:57
 * @描述: TODO
 */
public class ConcreteCreator extends Creator {

    /**
     * 实现抽象方法
     *
     * @return Product
     */
    @Override
    protected Product factoryMethod() {
        // 重定义工厂方法，返回一个具体的Product对象
        return new ConcreteProduct();
    }
}
