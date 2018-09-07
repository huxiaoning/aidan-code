package org.aidan.sample;

/**
 * @author 胡小宁
 * @创建时间：2018/9/7 上午10:28
 * @描述: 具体的创建器实现对象, 实现创建导出成数据库备份文件格式的对象
 */
public class ExportDbFileOperate extends ExportOperate {

    @Override
    protected ExportFileApi factoryMethod() {
        // 创建导出成数据库备份文件格式的对象
        return new ExportDbFile();
    }
}
