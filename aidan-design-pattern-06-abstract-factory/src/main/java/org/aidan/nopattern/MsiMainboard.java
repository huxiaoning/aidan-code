package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/9/14 上午9:10
 * @描述: 微星的主板实现
 */
public class MsiMainboard implements MainboardApi {

    /**
     * CPU插槽孔数
     */
    private int cpuHoles = 0;

    /**
     * 构造器
     *
     * @param cpuHoles
     */
    public MsiMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("now in MsiMainboard,cpuHoles = " + this.cpuHoles);
    }
}
