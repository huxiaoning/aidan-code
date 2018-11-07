package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/11/6 下午3:34
 * @描述: 消息的统计一接口
 */
public interface Message {

    /**
     * 发送消息
     *
     * @param message 要发送的消息内容
     * @param toUser  消息发送的目的人员
     */
    void send(String message, String toUser);
}
