package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/9/17 上午11:12
 * @描述: 订单的接口
 */
public interface OrderApi {

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


    /**
     * 克隆方法
     *
     * @return 订单原型的实例
     */
    OrderApi cloneOrder();
}
