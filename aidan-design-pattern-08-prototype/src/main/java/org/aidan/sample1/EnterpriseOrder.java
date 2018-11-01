package org.aidan.sample1;


/**
 * @author Aidan
 * @创建时间：2018/9/17 上午11:18
 * @描述: 企业订单对象
 */
public class EnterpriseOrder implements OrderApi {

    /**
     * 企业名称
     */
    private String enterpriseName;

    /**
     * 产品编号
     */
    private String productId;


    private int orderProductNum;

    @Override
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    @Override
    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }

    @Override
    public OrderApi cloneOrder() {
        // 创建一个新的订单，然后把本实例的数据复制过去
        EnterpriseOrder order = new EnterpriseOrder();
        order.setEnterpriseName(this.getEnterpriseName());
        order.setProductId(this.getProductId());
        order.setOrderProductNum(this.getOrderProductNum());
        return order;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "EnterpriseOrder{" +
                "enterpriseName='" + enterpriseName + '\'' +
                ", productId='" + productId + '\'' +
                ", orderProductNum=" + orderProductNum +
                '}';
    }
}
