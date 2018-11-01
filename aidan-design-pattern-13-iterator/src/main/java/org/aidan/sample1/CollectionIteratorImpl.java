package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/10/25 上午10:43
 * @描述: 用来实现访问Collection集合接口的迭代器
 */
public class CollectionIteratorImpl implements Iterator {

    /**
     * 用来存放被迭代的聚合对象
     */
    private PayManager aggregate = null;

    /**
     * 用来记录当前跌代到的位置索引
     */
    private int index = -1;

    public CollectionIteratorImpl(PayManager aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < this.aggregate.size()) {
            index++;
        }
    }

    @Override
    public boolean isDone() {
        if (index == this.aggregate.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return this.aggregate.get(index);
    }
}
