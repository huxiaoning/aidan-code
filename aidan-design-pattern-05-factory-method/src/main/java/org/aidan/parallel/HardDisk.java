package org.aidan.parallel;

/**
 * @author Aidan
 * @创建时间：2018/9/11 下午3:58
 * @描述: 硬盘产品接口
 */
public abstract class HardDisk {

    /**
     * 工厂方法
     */
    public abstract HDOperate createHDOPerate();


    public void read() {
        HDOperate operate = createHDOPerate();
        operate.read();
    }

    public void write() {
        HDOperate operate = createHDOPerate();
        operate.write();
    }
}
