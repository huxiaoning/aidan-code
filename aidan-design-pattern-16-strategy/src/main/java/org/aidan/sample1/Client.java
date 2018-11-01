package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/10/29 上午10:50
 * @描述: 客户端测试类
 */
public class Client {
    public static void main(String[] args) {
        PaymentStrategy rmbCash = new RMBCash();
        PaymentStrategy dollarCash = new DollarCash();

        PaymentContext context1 = new PaymentContext("小李", 5000, rmbCash);
        context1.payNow();

        PaymentContext context2 = new PaymentContext("Petter", 8000, dollarCash);
        context2.payNow();
    }
}
