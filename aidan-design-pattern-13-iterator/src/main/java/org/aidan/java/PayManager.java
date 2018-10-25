package org.aidan.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/10/25 上午10:09
 * @描述: 客户方已有的工资管理对象
 */
public class PayManager extends Aggregate {

    /**
     * 聚合对象，这里是Java的集合对象
     */
    private List list = new ArrayList();

    /**
     * 获取工资列表
     *
     * @return
     */
    public List getPayList() {
        return this.list;
    }

    /**
     * 计算工资，其实应该有很多参数，为了演示从简
     */
    public void calcPay() {
        // 计算工资，并把工资信息填充到工资列表中
        // 为了测试，输入些数据进去
        PayModel payModel1 = new PayModel();
        payModel1.setPay(3800);
        payModel1.setUserName("张三");

        PayModel payModel2 = new PayModel();
        payModel2.setPay(5800);
        payModel2.setUserName("李四");

        list.add(payModel1);
        list.add(payModel2);
    }

    public int size() {
        return this.list.size();
    }

    public Object get(int index) {
        return this.list.get(index);
    }

    @Override
    public Iterator createIterator() {
//        return new CollectionIteratorImpl(this);
        return list.iterator();
    }
}
