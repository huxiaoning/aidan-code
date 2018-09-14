package org.aidan.sample;


/**
 * @author Aidan
 * @创建时间：2018/9/14 下午5:40
 * @描述: 装机工程师类
 */
public class ComputerEngineer {
    /**
     * 定义组装机器需要的CPU
     */
    private CpuApi cpuApi = null;

    /**
     * 定义组装机器需要的主板
     */
    private MainboardApi mainboardApi = null;


    /**
     * 装机过程
     *
     * @param schema 客户选择的装机方案
     */
    public void makeComputer(AbstractFactory schema) {
        // 1 首先准备好装机所需要的配件
        prepareHardwares(schema);
        // 2 组装电脑
        // 3 测试电脑
        // 4 交付客户
    }


    /**
     * 准备装机所需要的配件
     *
     * @param schema 客户选择的装机方案
     */
    private void prepareHardwares(AbstractFactory schema) {
        // 这里要去准备CPU和主板的具体实现,为了示例简单，这里只准备这两个
        // 可是，装机工程师并不知道如何去创建，怎么办呢？
        // 使用抽象工厂来获取相应的接口对象
        this.cpuApi = schema.createCpuApi();
        this.mainboardApi = schema.createMainboardApi();

        // 测试一下配件是否好用
        this.cpuApi.calculate();
        this.mainboardApi.installCpu();
    }
}
