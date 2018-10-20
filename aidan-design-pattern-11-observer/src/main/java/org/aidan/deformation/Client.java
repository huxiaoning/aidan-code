package org.aidan.deformation;

/**
 * @author Aidan
 * @创建时间：2018/10/20 下午2:26
 * @描述: 区别对待观察者客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        WaterQuality subject = new WaterQuality();

        Watcher watcher1 = new Watcher();
        watcher1.setJob("监测人员");
        Watcher watcher2 = new Watcher();
        watcher2.setJob("预警人员");
        Watcher watcher3 = new Watcher();
        watcher3.setJob("监测部门领导");

        subject.attach(watcher1);
        subject.attach(watcher2);
        subject.attach(watcher3);

        System.out.println("当水质正常的时候------------------");
        subject.setPolluteLevel(0);
        System.out.println("当水质轻度污染的时候------------------");
        subject.setPolluteLevel(1);
        System.out.println("当水质中度污染的时候------------------");
        subject.setPolluteLevel(2);

    }
}
