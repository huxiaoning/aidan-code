package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/9/15 下午3:16
 * @描述: 描述输出到头文件的内容对象
 */
public class ExportHeaderModel {

    /**
     * 分公司或门市点编号
     */
    private String depId;

    /**
     * 导出数据的日期
     */
    private String exportDate;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getExportDate() {
        return exportDate;
    }

    public void setExportDate(String exportDate) {
        this.exportDate = exportDate;
    }
}
