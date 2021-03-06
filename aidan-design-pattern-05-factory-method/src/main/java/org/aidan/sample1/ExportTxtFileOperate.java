package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/9/7 上午10:28
 * @描述: 具体的创建器实现对象, 实现创建导出成文本文件格式的对象
 */
public class ExportTxtFileOperate extends ExportOperate {

    @Override
    protected ExportFileApi factoryMethod() {
        // 创建导出成文本文件格式的对象
        return new ExportTxtFile();
    }
}
