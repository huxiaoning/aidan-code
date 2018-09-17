package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/9/17 下午4:03
 * @描述: 克隆的具体实现对象1
 */
public class ConcretePrototype1 implements Prototype {


    @Override
    public Prototype clone() {
        // 最简单的克隆，创建一个自身对象，由于没有属性，就不再复制值了
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }
}
