package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/9/13 下午6:43
 * @描述: AMD的CPU实现
 */
public class AmdCpu implements CpuApi {

    /**
     * CPU的针脚数目
     */
    private int pins = 0;

    public AmdCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("now in the AMD CPU,pins = " + this.pins);
    }
}
