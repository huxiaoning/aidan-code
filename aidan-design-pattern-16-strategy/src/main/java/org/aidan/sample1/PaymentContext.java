package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/10/29 上午10:43
 * @描述: TODO
 */
public class PaymentContext {

    private String userName;

    private double money;

    private PaymentStrategy strategy;

    public PaymentContext(String userName, double money, PaymentStrategy strategy) {
        this.userName = userName;
        this.money = money;
        this.strategy = strategy;
    }

    public String getUserName() {
        return userName;
    }

    public double getMoney() {
        return money;
    }

    public void payNow() {
        this.strategy.pay(this);
    }
}
