package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/11/2 下午2:18
 * @描述: 不需要共享的flyweight对象
 * 通常是将被共享的享元对象作为子节点组合出来的对象
 */
public class UnshareConcreteFlyweight implements Flyweight {

    /**
     * 示例，描述对象的状态
     */
    private String allState;

    @Override
    public void operation(String extrinsicState) {
        // 具体的功能处理
    }
}
