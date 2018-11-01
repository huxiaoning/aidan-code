package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/10/29 上午10:41
 * @描述: 支付工资策略接口, 公司有多种支付工资的算法
 * 比如现金/银行卡/现金加股票/现金加期权/美元支付等等
 */
public interface PaymentStrategy {

    void pay(PaymentContext context);
}
