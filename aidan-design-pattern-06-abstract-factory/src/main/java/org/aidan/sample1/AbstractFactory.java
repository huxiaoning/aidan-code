package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/9/14 下午4:25
 * @描述: 抽象工厂的接口
 */
public interface AbstractFactory {

    /**
     * 创建CPU对象
     *
     * @return
     */
    CpuApi createCpuApi();

    /**
     * 创建主板对象
     *
     * @return
     */
    MainboardApi createMainboardApi();
}
