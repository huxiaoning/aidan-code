package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/29 上午10:16
 * @描述: 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        Strategy largeCustomerStrategy = new LargeCustomerStrategy();

        Price ctx = new Price(largeCustomerStrategy);

        double quote = ctx.quote(1000);

        System.out.println("向客户报价" + quote);
    }
}
