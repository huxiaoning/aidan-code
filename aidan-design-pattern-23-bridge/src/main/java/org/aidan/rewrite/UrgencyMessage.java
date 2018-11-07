package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/6 下午6:19
 * @描述: 加急消息实现
 */
public class UrgencyMessage extends AbstractMessage {
    /**
     * 构造器
     *
     * @param impl 实现部分的对象
     */
    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "加急：" + message;
        super.sendMessage(message, toUser);
    }

    public Object watch(String messageId) {
        // 获取相应的数据，组织成监控的数据对象，然后返回
        return null;
    }
}
