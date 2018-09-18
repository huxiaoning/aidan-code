package org.aidan.sample;

/**
 * @author Aidan
 * @创建时间：2018/9/18 下午4:13
 * @描述: 显卡类，一个同事类
 */
public class VideoCard extends Colleague {
    /**
     * 构造方法，传入中介者对象
     *
     * @param mediator 中介者对象
     */
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 显示视频数据
     *
     * @param data 被显示的数据
     */
    public void showData(String data) {
        System.out.println("您正在观看的是:" + data);
    }
}
