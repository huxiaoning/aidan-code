package org.aidan.parallel;

/**
 * @author Aidan
 * @创建时间：2018/9/11 下午4:23
 * @描述: TODO
 */
public class Client {
    public static void main(String[] args) {
        HardDisk hardDisk = new DesktopSeagateHardDisk();
        hardDisk.read();
        hardDisk.write();
    }
}
