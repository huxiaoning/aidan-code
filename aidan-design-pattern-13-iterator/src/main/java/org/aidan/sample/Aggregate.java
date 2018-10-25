package org.aidan.sample;


/**
 * @author Aidan
 * @创建时间：2018/10/24 下午4:54
 * @描述: 聚合对象的接口, 定义创建相应迭代器对象的接口
 */
public abstract class Aggregate {

    /**
     * 工厂方法,创建相应迭代器对象的接口
     *
     * @return
     */
    public abstract Iterator createIterator();
}
