package org.aidan.template;

/**
 * @author 胡小宁
 * @创建时间：2018/9/7 上午9:47
 * @描述: 具体的Product对象
 */
public class ConcreteProduct implements Product {

    // 实现Product要求的方法
    @Override
    public void hello() {
        System.out.println("Hello World!");
    }
}
