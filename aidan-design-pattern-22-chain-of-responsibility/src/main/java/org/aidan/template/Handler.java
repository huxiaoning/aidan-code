package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/11/6 上午10:37
 * @描述: 职责的接口，也就是处理请求的接口
 */
public abstract class Handler {

    /**
     * 持有后继的职责对象
     */
    protected Handler successor;

    /**
     * 设置后继的职责对象
     *
     * @param successor
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 示意处理请求的方法，虽然这个方法是没有传入参数的
     * 但实际是可以传入参数的，根据具体需要来选择是否传递参数
     */
    public abstract void handleRequest();
}