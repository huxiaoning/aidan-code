package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/11/6 下午4:05
 * @描述: 加急E-mail
 */
public class UrgencyMessageEmail implements UrgencyMessage {

    @Override
    public void send(String message, String toUser) {
        message = "加急：" + message;
        System.out.println("使用E-mail的方式，发送消息'" + message + "'给" + toUser);
    }

    @Override
    public Object watch(String messageId) {
        // 获取相应的数据，组织成监控的数据对象，然后返回
        return null;
    }
}
