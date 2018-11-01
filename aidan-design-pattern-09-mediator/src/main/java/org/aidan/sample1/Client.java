package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/9/18 下午4:50
 * @描述: 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        // 1 创建中介者 - 主板对象
        MotherBoard mediator = new MotherBoard();
        // 2 创建同事类
        CdDriver cdDriver = new CdDriver(mediator);
        Cpu cpu = new Cpu(mediator);
        VideoCard videoCard = new VideoCard(mediator);
        SoundCard soundCard = new SoundCard(mediator);
        // 3 让中介者知道所有同事
        mediator.setCdDriver(cdDriver);
        mediator.setCpu(cpu);
        mediator.setVideoCard(videoCard);
        mediator.setSoundCard(soundCard);

        // 4 开始看电影，把光盘放入光驱，光驱开始读光盘
        cdDriver.readCd();

    }
}
