package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/9/14 下午5:32
 * @描述: 装机方案二 ： AMD的CPU + 微星的主板
 * 这里创建的CPU和主板对象的时候，是对应的，能匹配上的
 */
public class Schema2 implements AbstractFactory {
    @Override
    public CpuApi createCpuApi() {
        return new AmdCpu(939);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new MsiMainboard(939);
    }
}
