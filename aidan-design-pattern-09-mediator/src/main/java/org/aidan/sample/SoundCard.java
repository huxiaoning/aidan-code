package org.aidan.sample;

/**
 * @author Aidan
 * @创建时间：2018/9/18 下午4:26
 * @描述: 声卡类，一个同事类
 */
public class SoundCard extends Colleague {
    /**
     * 构造方法，传入中介者对象
     *
     * @param mediator 中介者对象
     */
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 按照音频数据发出声音
     *
     * @param data 音频数据
     */
    public void soundData(String data) {
        System.out.println("画外音:" + data);
    }
}
