package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/9/13 下午6:43
 * @描述: intel的CPU实现
 */
public class IntelCpu implements CpuApi {

    /**
     * CPU的针脚数目
     */
    private int pins = 0;

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("now in the Intel CPU,pins = " + this.pins);
    }
}
