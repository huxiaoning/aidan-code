package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/7 上午9:08
 * @描述: 特急消息实现
 */
public class SpecialUrgencyMessage extends AbstractMessage {
    /**
     * 构造器
     *
     * @param impl 实现部分的对象
     */
    public SpecialUrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "特急：" + message;
        super.sendMessage(message, toUser);
        // 还需要增加一条待催促的信息
    }
}
