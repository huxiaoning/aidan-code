package org.aidan.sample;


/**
 * @author Aidan
 * @创建时间：2018/9/17 下午3:46
 * @描述: 客户端类
 */
public class Client {

    public static void main(String[] args) {
        // 创建订单对象，这里为了演示简单，直接new了
        PersonalOrder op = new PersonalOrder();
        // 设置订单数据
        op.setOrderProductNum(2925);
        op.setCustomerName("张三");
        op.setProductId("P001");

        // 这里获取业务处理的类，也直接new了，为了简单，连业务接口都没做
        OrderBusiness ob = new OrderBusiness();
        // 调用业务来保存订单对象
        ob.saveOrder(op);
    }
}
