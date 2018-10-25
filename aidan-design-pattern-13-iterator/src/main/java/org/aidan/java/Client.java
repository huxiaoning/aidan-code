package org.aidan.java;


import java.util.Iterator;

/**
 * @author Aidan
 * @创建时间：2018/10/25 下午4:04
 * @描述: 使用Java中的迭代器
 */
public class Client {

    public static void main(String[] args) {
        PayManager payManager = new PayManager();
        payManager.calcPay();
        System.out.println("集团工资列表");
        Iterator it = payManager.createIterator();
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);
        }


        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        System.out.println("新收购公司工资列表");
        it = salaryManager.createIterator();
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);
        }

    }
}
