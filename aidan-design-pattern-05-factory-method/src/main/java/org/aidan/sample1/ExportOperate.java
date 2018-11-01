package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/9/7 上午10:24
 * @描述: 导出操作，相当于工厂类，提供工厂方法
 */
public abstract class ExportOperate {

    /**
     * 工厂方法
     */
    protected abstract ExportFileApi factoryMethod();

    /**
     * 导出数据到文件
     *
     * @param data
     * @return
     */
    public boolean export(String data) {
        ExportFileApi api = factoryMethod();
        api.export(data);
        return true;
    }

}
