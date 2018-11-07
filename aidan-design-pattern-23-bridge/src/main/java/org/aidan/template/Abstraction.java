package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/11/6 下午2:39
 * @描述: 定义抽象部分的接口
 */
public abstract class Abstraction {

    protected Implementor impl;

    public Abstraction(Implementor impl) {
        this.impl = impl;
    }

    public void operation() {
        impl.operationImpl();
    }
}
