package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/6 下午6:14
 * @描述: 普通消息实现
 */
public class CommonMessage extends AbstractMessage {
    /**
     * 构造器
     *
     * @param impl 实现部分的对象
     */
    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        // 对于普通消息，什么都不干，直接调用父类的方法，把消息发出去就可以了
        super.sendMessage(message, toUser);
    }
}
