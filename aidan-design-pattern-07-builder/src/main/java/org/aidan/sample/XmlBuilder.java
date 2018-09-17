package org.aidan.sample;

import org.aidan.nopattern.ExportDataModel;
import org.aidan.nopattern.ExportFooterModel;
import org.aidan.nopattern.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * @author Aidan
 * @创建时间：2018/9/17 上午10:18
 * @描述: 实现导出数据到XML文件的生成器对象
 */
public class XmlBuilder implements Builder {

    /**
     * 用来记录构建的文件的内容,相当于产品
     */
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        // 1 先来拼凑文件头的内容
        buffer.append("<?xml version='1.0' encoding='gb2312'?>\n");
        buffer.append("<Report>\n");
        buffer.append("    <Header>\n");
        buffer.append("        <DeptId>" + ehm.getDepId() + "</DeptId>\n");
        buffer.append("        <ExportDate>" + ehm.getExportDate() + "</ExportDate>\n");
        buffer.append("    </Header>\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        // 2 再来拼接文件体的内容
        buffer.append("    <Body>\n");
        for (String tblName : mapData.keySet()) {
            // 先拼接表名称
            buffer.append("        <Datas TableName=\"" + tblName + "\">\n");
            // 然后循环拼接具体数据
            for (ExportDataModel edm : mapData.get(tblName)) {
                buffer.append("            <Data>\n");
                buffer.append("                <ProductId>" + edm.getProductId() + "</ProductId>\n");
                buffer.append("                <Price>" + edm.getPrice() + "</Price>\n");
                buffer.append("                <Amount>" + edm.getAmout() + "</Amount>\n");
                buffer.append("            </Data>\n");
            }
            buffer.append("        </Datas>\n");
        }
        buffer.append("    </Body>\n");
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        // 3 接着拼接文件文件尾的内容
        buffer.append("    <Footer>\n");
        buffer.append("        <ExportUser>" + efm.getExportUser() + "</ExportUser>\n");
        buffer.append("    </Footer>\n");
        buffer.append("</Report>\n");
    }

    @Override
    public StringBuffer getResult() {
        return buffer;
    }
}
