package org.aidan.sample1;

/**
 * 导出数据到文件的接口
 * 就工厂方法需要创建的对象接口
 */
public interface ExportFileApi {

    /**
     * @param data
     */
    boolean export(String data);
}
