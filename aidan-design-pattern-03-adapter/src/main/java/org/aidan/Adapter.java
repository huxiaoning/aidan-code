package org.aidan;

/**
 * 适配器
 */
public class Adapter implements Target {

    /**
     * 持有需要被适配的接口对象
     */
    private Adaptee adaptee;

    /**
     * 构造器，传入需要被配的对象
     *
     * @param adaptee
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // 转调已经实现了的方法，进行适配
        adaptee.specificRequest();
    }
}
