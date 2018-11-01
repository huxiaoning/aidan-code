package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/10/25 上午10:35
 * @描述: 用来实现访问数组的迭代器接口
 */
public class ArryIteratorImpl implements Iterator {

    /**
     * 用来存放被迭代的聚合对象
     */
    private SalaryManager aggregate;

    /**
     * 用来记录当前跌代到的位置索引
     */
    private int index = -1;

    public ArryIteratorImpl(SalaryManager aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < this.aggregate.size()) {
            index += 1;
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
