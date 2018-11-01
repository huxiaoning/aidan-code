package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/29 上午10:14
 * @描述: 价格管理，主要完成计算向客户所报价的功能
 */
public class Price {

    private Strategy strategy;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }


    public double quote(double goodsPrice) {
        return this.strategy.calcPrice(goodsPrice);
    }

}
