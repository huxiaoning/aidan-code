package org.aidan.sample1;

import org.aidan.nopattern.ExportDataModel;
import org.aidan.nopattern.ExportFooterModel;
import org.aidan.nopattern.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * @author Aidan
 * @创建时间：2018/9/17 上午10:21
 * @描述: 指导者，指导使用生成器的接口来构建输出的文件的对象
 */
public class Director {

    /**
     * 持有当前需要使用的生成器对象
     */
    private Builder builder;

    /**
     * 构造方法，传入生成器对象
     *
     * @param builder
     */
    public Director(Builder builder) {
        this.builder = builder;
    }


    public void construct(ExportHeaderModel ehm, Map<String, Collection<ExportDataModel>> mapData, ExportFooterModel efm) {
        // 1 先构建Header
        builder.buildHeader(ehm);
        // 2 然后构建Body
        builder.buildBody(mapData);
        // 3 再构建Footer
        builder.buildFooter(efm);
    }
}
