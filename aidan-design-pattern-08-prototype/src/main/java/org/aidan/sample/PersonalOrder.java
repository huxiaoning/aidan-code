package org.aidan.sample;


/**
 * @author Aidan
 * @创建时间：2018/9/17 上午11:15
 * @描述: 个人订单对象
 */
public class PersonalOrder implements OrderApi {

    /**
     * 订购人员姓名
     */
    private String customerName;

    /**
     * 产品编号
     */
    private String productId;

    private int orderProductNum = 0;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public int getOrderProductNum() {
        return orderProductNum;
    }

    @Override
    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }

    @Override
    public OrderApi cloneOrder() {
        // 创建一个新的订单，然后把本实例的数据复制过去
        PersonalOrder order = new PersonalOrder();
        order.setCustomerName(this.getCustomerName());
        order.setProductId(this.getProductId());
        order.setOrderProductNum(this.getOrderProductNum());
        return order;
    }

    @Override
    public String toString() {
        return "PersonalOrder{" +
                "customerName='" + customerName + '\'' +
                ", productId='" + productId + '\'' +
                ", orderProductNum=" + orderProductNum +
                '}';
    }
}
