package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/9/7 上午10:13
 * @描述: 导出数据到文件的接口实现之一
 */
public class ExportTxtFile implements ExportFileApi {
    /**
     * 导出文本格式的对象
     *
     * @param data
     */
    @Override
    public boolean export(String data) {
        // 简单示意一下，这里需要操作文件
        System.out.println("导出数据" + data + "到文本文件");
        return true;
    }
}
