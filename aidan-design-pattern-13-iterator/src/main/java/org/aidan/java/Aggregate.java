package org.aidan.java;

import java.util.Iterator;

/**
 * @author Aidan
 * @创建时间：2018/10/25 下午3:48
 * @描述: 聚合对象接口
 */
public abstract class Aggregate {

    /**
     * 工厂方法,创建相应迭代器对象的接口
     *
     * @return
     */
    public abstract Iterator createIterator();
}
