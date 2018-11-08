package org.aidan.scene;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Aidan
 * @创建时间：2018/11/7 下午2:16
 * @描述: 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        Collection<Customer> colCustomer = preparedTestDate();
        for (Customer cm : colCustomer) {
            // 进行偏好分析
            cm.predilectionAnalyze();
            // 进行价值分析
            cm.worthAnalyze();
        }

    }

    /**
     * 为了测试方便，准备一些测试数据
     *
     * @return
     */
    private static Collection<Customer> preparedTestDate() {
        Collection<Customer> colCustomer = new ArrayList<>();

        Customer cm1 = new EnterpriseCustomer();
        cm1.setName("ABC集团");
        colCustomer.add(cm1);

        Customer cm2 = new EnterpriseCustomer();
        cm2.setName("CDE公司");
        colCustomer.add(cm2);

        Customer cm3 = new PersonalCustomer();
        cm3.setName("张三");
        colCustomer.add(cm3);

        return colCustomer;
    }
}
