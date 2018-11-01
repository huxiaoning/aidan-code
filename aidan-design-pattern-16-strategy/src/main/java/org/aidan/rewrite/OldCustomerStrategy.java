package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/29 上午10:02
 * @描述: 具体的算法实现，为老客户计算报价
 */
public class OldCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于老客户统一折扣5%");
        return goodsPrice * (1 - 0.05);
    }
}
