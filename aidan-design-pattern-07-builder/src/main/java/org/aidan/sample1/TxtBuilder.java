package org.aidan.sample1;

import org.aidan.nopattern.ExportDataModel;
import org.aidan.nopattern.ExportFooterModel;
import org.aidan.nopattern.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * @author Aidan
 * @创建时间：2018/9/17 上午10:13
 * @描述: 实现导出数据到TXT文件的生成器对象
 */
public class TxtBuilder implements Builder {

    /**
     * 用来记录构建的文件的内容,相当于产品
     */
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append(ehm.getDepId() + "," + ehm.getExportDate() + "\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        for (String tblName : mapData.keySet()) {
            // 先拼接表名称
            buffer.append(tblName + "\n");
            // 然后循环拼接具体数据
            for (ExportDataModel edm : mapData.get(tblName)) {
                buffer.append(edm.getProductId() + "," + edm.getPrice() + "," + edm.getAmout() + "\n");
            }
        }
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        buffer.append(efm.getExportUser());
    }

    @Override
    public StringBuffer getResult() {
        return buffer;
    }
}
