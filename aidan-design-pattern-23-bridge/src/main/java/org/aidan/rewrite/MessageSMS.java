package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/6 下午4:43
 * @描述: 以站内短消息的方式发送消息
 */
public class MessageSMS implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用站内短消息的方式，发送消息'" + message + "'给" + toUser);
    }
}