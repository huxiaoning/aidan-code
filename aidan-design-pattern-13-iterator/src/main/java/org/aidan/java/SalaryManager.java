package org.aidan.java;


import java.util.Iterator;

/**
 * @author Aidan
 * @创建时间：2018/10/25 上午10:19
 * @描述: 被客户方收购的那个公司的的工资管理类
 */
public class SalaryManager extends Aggregate {

    /**
     * 用数组管理
     */
    private PayModel[] pms = new PayModel[2];

    /**
     * 获取工资列表
     *
     * @return
     */
    public PayModel[] getPays() {
        return this.pms;
    }

    /**
     * 计算工资，其实应该有很多参数，为了演示从简
     */
    public void calcSalary() {
        // 计算工资，并把工资信息填充到工资列表中
        // 为了测试，输入些数据进去
        PayModel payModel1 = new PayModel();
        payModel1.setPay(2200);
        payModel1.setUserName("王五");

        PayModel payModel2 = new PayModel();
        payModel2.setPay(3600);
        payModel2.setUserName("赵六");

        pms[0] = payModel1;
        pms[1] = payModel2;
    }

    public int size() {
        return this.pms.length;
    }

    public PayModel get(int index) {
        return this.pms[index];
    }

    @Override
    public Iterator createIterator() {
        return new ArryIteratorImpl(this);
    }
}
