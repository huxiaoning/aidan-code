package org.aidan.protectionagent;

/**
 * @author Aidan
 * @创建时间：2018/10/16 上午11:19
 * @描述: 订单代理对象
 */
public class OrderProxy implements OrderApi {

    /**
     * 持有被代理的具体的目标对象
     */
    private Order order;

    /**
     * 构造方法,传入被代理的具体的目标对象
     *
     * @param order
     */
    public OrderProxy(Order order) {
        this.order = order;
    }

    @Override
    public String getProductName() {
        return this.order.getProductName();
    }

    @Override
    public void setProductName(String productName, String user) {
        // 控制访问权限，只有创建订单的人员才能修改
        if (user != null && user.equals(this.getOrderUser())) {
            order.setProductName(productName, user);
        } else {
            System.out.println("对不起，" + user + ",您无权修改订单产品中的产品名称。");
        }
    }

    @Override
    public int getOrderNum() {
        return this.order.getOrderNum();
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        // 控制访问权限，只有创建订单的人员才能够修改
        if (user != null && user.equals(this.getOrderUser())) {
            order.setOrderNum(orderNum, user);
        } else {
            System.out.println("对不起，" + user + ",您无权修改订单产品中的订单数量。");
        }
    }

    @Override
    public String getOrderUser() {
        return this.order.getOrderUser();
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        // 控制访问权限，只有创建订单的人员才能够修改
        if (user == null || !user.equals(this.getOrderUser())) {
            System.out.println("对不起，" + user + ",您无权修改订单产品中的订购人。");
            return;
        }
        order.setOrderUser(orderUser, user);
    }

    @Override
    public String toString() {
        return order.toString();
    }
}
