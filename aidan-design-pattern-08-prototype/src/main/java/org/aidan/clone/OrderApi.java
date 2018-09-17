package org.aidan.clone;

/**
 * @author Aidan
 * @创建时间：2018/9/17 上午11:12
 * @描述: 订单的接口
 */
public interface OrderApi extends Cloneable {

    /**
     * 获取订单产品数量
     *
     * @return 订单中产品数量
     */
    int getOrderProductNum();

    /**
     * 设置订单产品数量
     *
     * @param orderProductNum 订单产品数量
     */
    void setOrderProductNum(int orderProductNum);

    Object clone();
}
