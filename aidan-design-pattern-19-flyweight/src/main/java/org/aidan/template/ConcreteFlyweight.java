package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/11/2 下午2:11
 * @描述: 享元对象
 */
public class ConcreteFlyweight implements Flyweight {

    /**
     * 示例，描述内部状态
     */
    private String intrinsicState;

    /**
     * 构造方法，传入享元对象的内部状态的数据
     *
     * @param state
     */
    public ConcreteFlyweight(String state) {
        this.intrinsicState = state;
    }

    @Override
    public void operation(String extrinsicState) {
        // 具体的功能处理，可能会用到享元内部/外部的状态
    }
}
