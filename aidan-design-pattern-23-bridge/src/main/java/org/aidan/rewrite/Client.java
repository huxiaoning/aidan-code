package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/7 上午9:13
 * @描述: 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        // 发站内信的实现
        MessageImplementor impl = new MessageSMS();
        // 发普通消息
        AbstractMessage m = new CommonMessage(impl);
        // 以站内信的方式发普通消息
        m.sendMessage("请喝一杯茶", "小李");

        // 发加急消息
        m = new UrgencyMessage(impl);
        // 以站内信的方式发加急消息
        m.sendMessage("请喝一杯茶", "小李");
        // 发特急消息
        m = new SpecialUrgencyMessage(impl);
        m.sendMessage("请喝一杯茶", "小李");


        // 发手机短信的实现
        impl = new MessageMobile();
        m = new CommonMessage(impl);
        // 以站内信的方式发普通消息
        m.sendMessage("请喝一杯茶", "小李");

        // 发加急消息
        m = new UrgencyMessage(impl);
        // 以站内信的方式发加急消息
        m.sendMessage("请喝一杯茶", "小李");
        // 发特急消息
        m = new SpecialUrgencyMessage(impl);
        m.sendMessage("请喝一杯茶", "小李");


    }
}
