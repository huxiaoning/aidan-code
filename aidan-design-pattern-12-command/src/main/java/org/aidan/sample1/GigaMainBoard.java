package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/10/20 下午4:15
 * @描述: 技嘉主板类，开机命令的真正实现者，在Command模式中充当Receiver
 */
public class GigaMainBoard implements MainBoardApi {

    /**
     * 真正的开机命令实现
     */
    @Override
    public void open() {
        System.out.println("真正的开机命令实现");
    }

    @Override
    public void reset() {
        System.out.println("真正的重启命令实现");
    }
}
