package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/9/18 下午3:43
 * @描述: 光驱类，一个同事类
 */
public class CdDriver extends Colleague {
    /**
     * 构造方法，传入中介者对象
     *
     * @param mediator 中介者对象
     */
    public CdDriver(Mediator mediator) {
        super(mediator);
    }

    /**
     * 光驱读出来的数据
     */
    private String data = "";

    /**
     * 获取光驱读出来的数据
     *
     * @return
     */
    public String getData() {
        return data;
    }

    /**
     * 读取光盘
     */
    public void readCd() {
        // 逗号前是视频显示的数据，逗号后是声音
        this.data = "设计模式,值得好好研究";
        // 通知主板，自已的状态发生了改变
        this.getMediator().changed(this);
    }
}
