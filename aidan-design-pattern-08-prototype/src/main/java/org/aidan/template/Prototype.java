package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/9/17 下午4:00
 * @描述: 声明一个克隆自身的接口
 */
public interface Prototype {

    /**
     * 克隆自身的方法
     *
     * @return 一个从自身克隆出来的对象
     */
    Prototype clone();
}
