package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/9/17 上午9:47
 * @描述: 具体的生成器实现对象
 */
public class ConcreteBuilder implements Builder {

    /**
     * 生成器最终构建的产品对象
     */
    private Product resultProduct;

    public Product getResultProduct() {
        return resultProduct;
    }

    @Override
    public void buildPart() {
        // 构建某个部件的处理功能
    }
}
