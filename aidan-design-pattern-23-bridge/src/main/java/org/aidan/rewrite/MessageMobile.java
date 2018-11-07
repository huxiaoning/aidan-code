package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/7 上午9:11
 * @描述: 以手机短消息的方式发送消息
 */
public class MessageMobile implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用手机短消息的方式，发送消息'" + message + "'给" + toUser);
    }
}
