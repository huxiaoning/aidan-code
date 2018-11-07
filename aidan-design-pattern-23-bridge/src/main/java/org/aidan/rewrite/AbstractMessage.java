package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/6 下午4:35
 * @描述: 抽象的消息对象
 */
public abstract class AbstractMessage {

    /**
     * 持有一个实现部分的对象
     */
    protected MessageImplementor impl;

    /**
     * 构造器
     *
     * @param impl 实现部分的对象
     */
    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }

    public void sendMessage(String message, String toUser) {
        this.impl.send(message, toUser);
    }
}
