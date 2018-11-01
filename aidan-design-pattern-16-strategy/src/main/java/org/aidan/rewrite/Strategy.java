package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/29 上午9:58
 * @描述: 策略，定义计算报价的算法的接口
 */
public interface Strategy {

    /**
     * 计算报价
     *
     * @param goodsPrice
     * @return
     */
    double calcPrice(double goodsPrice);
}
