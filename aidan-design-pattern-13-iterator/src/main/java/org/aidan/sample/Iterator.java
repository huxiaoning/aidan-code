package org.aidan.sample;

/**
 * @author Aidan
 * @创建时间：2018/10/25 上午10:32
 * @描述: 定义统一访问的迭代器接口
 */
public interface Iterator {
    /**
     * 移动到聚合对象的第一个位置
     */
    void first();

    /**
     * 移动到聚合对象的下一个位置
     */
    void next();

    /**
     * 判断是否已经移动到聚合对象的最后一个位置
     *
     * @return
     */
    boolean isDone();

    /**
     * 获取迭代的当前元素
     *
     * @return
     */
    Object currentItem();

}
