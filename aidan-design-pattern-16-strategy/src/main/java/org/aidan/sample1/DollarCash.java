package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/10/29 上午10:44
 * @描述: 美元现金支付
 */
public class DollarCash implements PaymentStrategy {
    @Override
    public void pay(PaymentContext context) {
        System.out.println("现在给" + context.getUserName() + "美元现金支付" + context.getMoney() + "元");
    }
}
