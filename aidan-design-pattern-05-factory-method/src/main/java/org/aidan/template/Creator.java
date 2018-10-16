package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/9/7 上午9:51
 * @描述: 创建器 声明工厂方法
 */
public abstract class Creator {

    /**
     * 创建Product的工厂方法
     *
     * @return Product
     */
    protected abstract Product factoryMethod();

    /**
     * 示意方法,实现某些功能的方法
     */
    public void someOperation() {
        Product product = factoryMethod();
        product.hello();
    }
}
