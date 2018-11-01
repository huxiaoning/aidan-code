package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/10/29 上午9:36
 * @描述: 上下文对象，通常会持有一个具体的策略对象
 */
public class Context {

    /**
     * 持有一个具体的策略对象
     */
    private Strategy strategy;

    /**
     * 构造方法，传入一个具体的策略对象
     *
     * @param strategy
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 上下文对客户端提供的操作接口,可以有参数和返回值
     */
    public void contextInterface() {
        // 通常会转调具体的策略
        strategy.algorithmInterface();
    }
}
