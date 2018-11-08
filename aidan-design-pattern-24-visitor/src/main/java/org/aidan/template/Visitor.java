package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/11/7 下午2:59
 * @描述: 访问者接口
 */
public interface Visitor {

    /**
     * 访问元素A,相当于给元素A添加访问者的功能
     *
     * @param elementA 元素A的对象
     */
    void visitConcreteElementA(ConcreteElementA elementA);

    /**
     * 访问元素B,相当于给元素A添加访问者的功能
     *
     * @param elementB 元素B的对象
     */
    void visitConcreteElementB(ConcreteElementB elementB);
}
