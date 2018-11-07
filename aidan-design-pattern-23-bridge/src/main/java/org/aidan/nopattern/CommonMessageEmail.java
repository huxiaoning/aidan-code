package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/11/6 下午3:44
 * @描述: 以E-mail的方式发送普通消息
 */
public class CommonMessageEmail implements Message {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用E-mail的方式，发送消息'" + message + "'给" + toUser);
    }
}
