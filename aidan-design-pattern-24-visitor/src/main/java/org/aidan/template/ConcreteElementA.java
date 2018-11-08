package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/11/7 下午3:01
 * @描述: 具体元素的实现对象
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public void opertionA() {
        // 已有的功能实现
    }
}
