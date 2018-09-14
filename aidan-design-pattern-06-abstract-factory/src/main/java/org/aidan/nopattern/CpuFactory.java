package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/9/14 上午9:16
 * @描述: 创建CPU的简单工厂
 */
public class CpuFactory {


    /**
     * 创建CPU接口对象的方法
     *
     * @param type 决定CPU的具体实现(1 IntelCpu 2 AmdCpu)
     * @return
     */
    public static CpuApi createCpuApi(int type) {
        CpuApi cpuApi = null;
        // 根据参数选择CpuApi的具体实现
        if (type == 1) {
            cpuApi = new IntelCpu(1156);
        } else if (type == 2) {
            cpuApi = new AmdCpu(939);
        }
        return cpuApi;
    }
}
