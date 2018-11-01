package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/29 上午10:01
 * @描述: 具体的算法实现，为新客户或普通客户计算报价
 */
public class NormalCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于新客户或普通客户没有折扣");
        return goodsPrice;
    }
}
