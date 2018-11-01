package org.aidan.sample1;

import org.aidan.nopattern.ExportDataModel;
import org.aidan.nopattern.ExportFooterModel;
import org.aidan.nopattern.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * @author Aidan
 * @创建时间：2018/9/17 上午10:04
 * @描述: 生成器接口, 定义创建一个输出文件对象所需的各个部件的操作
 */
public interface Builder {

    /**
     * 构建输出文件的Header部分
     *
     * @param ehm 文件头的内容
     */
    void buildHeader(ExportHeaderModel ehm);

    /**
     * 构建输出文件的body部分
     *
     * @param mapData 要输出的数据的内容
     */
    void buildBody(Map<String, Collection<ExportDataModel>> mapData);

    /**
     * 构建输出文件的Footer部分
     *
     * @param efm 文件尾的内容
     */
    void buildFooter(ExportFooterModel efm);

    /**
     * 用来返回处理结果
     *
     * @return
     */
    StringBuffer getResult();
}
