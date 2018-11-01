package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/9/18 下午3:59
 * @描述: CPU, 一个同事类
 */
public class Cpu extends Colleague {
    /**
     * 构造方法，传入中介者对象
     *
     * @param mediator 中介者对象
     */
    public Cpu(Mediator mediator) {
        super(mediator);
    }

    /**
     * 分解出来的视频数据
     */
    private String videoData = "";

    /**
     * 分解出来的声音数据
     */
    private String soundData = "";

    /**
     * 获取分解出来的视频数据
     *
     * @return 分解出来的视频数据
     */
    public String getVideoData() {
        return videoData;
    }

    /**
     * 获取分解出来的声音数据
     *
     * @return 分解出来的声音数据
     */
    public String getSoundData() {
        return soundData;
    }

    /**
     * 处理数据，把数据分成音频和视频的数据
     * 业务方法，也是和中介者交互的方法
     *
     * @param data 被处理的数据
     */
    public void executeData(String data) {
        // 把数据分解开，前面是视频数据，后面是音频数据
        String[] ss = data.split(",");
        this.videoData = ss[0];
        this.soundData = ss[1];
        // 通知主板，CPU工作完成
        this.getMediator().changed(this);
    }
}
