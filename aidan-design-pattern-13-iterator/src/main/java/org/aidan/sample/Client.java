package org.aidan.sample;

import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/10/25 上午10:24
 * @描述: 跌器模式客户端测试类
 */
public class Client {


    /**
     * 不使用模式，分别访问两种不同的工资体系
     */
    private static void a() {
        PayManager payManager = new PayManager();
        payManager.calcPay();
        List payList = payManager.getPayList();
        System.out.println("集团工资列表");
        for (Object obj : payList) {
            System.out.println(obj);
        }

        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        PayModel[] pays = salaryManager.getPays();
        System.out.println("新收购公司工资列表");
        for (PayModel pm : pays) {
            System.out.println(pm);
        }
    }

    /**
     * 使用迭代器模式统计访问入口
     */
    public static void b() {
        PayManager payManager = new PayManager();
        payManager.calcPay();
        System.out.println("集团工资列表");
        c(payManager.createIterator());

        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        System.out.println("新收购公司工资列表");
        c(salaryManager.createIterator());
    }

    private static void c(Iterator it) {
        it.first();
        while (!it.isDone()) {
            Object obj = it.currentItem();
            System.out.println("the obj = " + obj);
            it.next();
        }
    }

    public static void main(String[] args) {
        // 不使用模式，分别访问两种不同的工资体系
//        a();

        // 使用迭代器模式统一访问入口
        b();
    }
}
