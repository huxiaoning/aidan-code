package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/9/13 下午6:47
 * @描述: 技嘉主板实现
 */
public class GaMainboard implements MainboardApi {

    /**
     * CPU插槽孔数
     */
    private int cpuHoles = 0;

    /**
     * 构造器
     *
     * @param cpuHoles
     */
    public GaMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("now in GaMainboard,cpuHoles = " + this.cpuHoles);
    }
}
