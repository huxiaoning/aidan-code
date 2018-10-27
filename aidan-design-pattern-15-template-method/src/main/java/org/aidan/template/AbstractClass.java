package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/10/27 下午2:17
 * @描述: 定义模板方法，原语操作等的抽象类
 */
public abstract class AbstractClass {

    /**
     * 原语操作1，所谓原语句操作就是抽象的操作,必须要由子类提供实现
     */
    public abstract void doPrimitiveOperation1();

    /**
     * 原语句操作2
     */
    public abstract void doPrimitiveOperation2();

    /**
     * 模板方法，定义算法骨架
     */
    public final void templateMethod() {
        doPrimitiveOperation1();
        doPrimitiveOperation2();
    }
}
