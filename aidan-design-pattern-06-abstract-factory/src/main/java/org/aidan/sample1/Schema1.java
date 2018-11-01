package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/9/14 下午5:28
 * @描述: 装机方案一 ： Intel的CPU + 技嘉的主板
 * 这里创建的CPU和主板对象的时候，是对应的，能匹配上的
 */
public class Schema1 implements AbstractFactory {
    @Override
    public CpuApi createCpuApi() {
        return new IntelCpu(1156);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new GaMainboard(1156);
    }
}
