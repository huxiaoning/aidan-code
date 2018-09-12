package org.aidan.parallel;

/**
 * @author Aidan
 * @创建时间：2018/9/11 下午4:03
 * @描述: 台式机希捷硬盘
 */
public class DesktopSeagateHardDisk extends HardDisk {


    @Override
    public HDOperate createHDOPerate() {
        return new DesktopSeagateHDOperate();
    }
}
