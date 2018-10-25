package org.aidan.java;

import java.util.Iterator;

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
    private int index = 0;

    public ArryIteratorImpl(SalaryManager aggregate) {
        this.aggregate = aggregate;
    }


    @Override
    public boolean hasNext() {
        if (aggregate == null) {
            return false;
        }
        if (index >= aggregate.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            return null;
        }
        Object obj = aggregate.get(index);
        index++;
        return obj;
    }
}
