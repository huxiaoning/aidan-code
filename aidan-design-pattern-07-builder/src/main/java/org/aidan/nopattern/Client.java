package org.aidan.nopattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Aidan
 * @创建时间：2018/9/17 上午9:12
 * @描述: 客户端
 */
public class Client {

    public static void main(String[] args) {
        // 准备测试数据
        ExportHeaderModel ehm = new ExportHeaderModel();
        ehm.setDepId("一分公司");
        ehm.setExportDate("2010-05-18");

        Map<String, Collection<ExportDataModel>> mapData = new HashMap<>();
        Collection<ExportDataModel> col = new ArrayList<>();
        ExportDataModel edm1 = new ExportDataModel();
        edm1.setProductId("产品001号");
        edm1.setPrice(100);
        edm1.setAmout(80);
        ExportDataModel edm2 = new ExportDataModel();
        edm2.setProductId("产品002号");
        edm2.setPrice(99);
        edm2.setAmout(55);

        // 把数据组装起来
        col.add(edm1);
        col.add(edm2);
        mapData.put("销售记录表", col);

        ExportFooterModel efm = new ExportFooterModel();
        efm.setExportUser("张三");

        // 测试输出到文本文件
        ExportToTxt toTxt = new ExportToTxt();
        toTxt.export(ehm, mapData, efm);
        // 测试输出到xml文件
        ExportToXml toXml = new ExportToXml();
        toXml.export(ehm, mapData, efm);
    }
}
