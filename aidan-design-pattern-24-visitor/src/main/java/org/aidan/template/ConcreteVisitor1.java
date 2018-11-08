package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/11/7 下午3:08
 * @描述: 具体的访问者实现
 */
public class ConcreteVisitor1 implements Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA elementA) {
        // 把要访问ConcreteElementA时，需要执行的功能实现在这里
        // 可能需要访问元素已有的功能，比如
        elementA.opertionA();
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB elementB) {
        // 把要访问ConcreteElementB时，需要执行的功能实现在这里
        // 可能需要访问元素已有的功能，比如
        elementB.opertionB();
    }
}
