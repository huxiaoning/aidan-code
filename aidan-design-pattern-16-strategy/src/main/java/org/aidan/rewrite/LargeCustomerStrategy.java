package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/29 上午10:05
 * @描述: 具体的算法实现，为大客户计算报价
 */
public class LargeCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于大客户，统一折扣10%");
        return goodsPrice * (1 - 0.1);
    }
}
