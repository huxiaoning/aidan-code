package org.aidan.parallel;

/**
 * @author Aidan
 * @创建时间：2018/9/11 下午4:20
 * @描述: TODO
 */
public class DesktopSeagateHDOperate implements HDOperate {
    @Override
    public void write() {
        System.out.println("台式机希捷硬盘（写数据）。");
    }

    @Override
    public void read() {
        System.out.println("台式机希捷硬盘（读数据）。");
    }
}
