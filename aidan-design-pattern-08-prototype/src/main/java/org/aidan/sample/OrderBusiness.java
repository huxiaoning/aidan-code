package org.aidan.sample;


/**
 * @author Aidan
 * @创建时间：2018/9/17 上午11:25
 * @描述: 处理订单的业务对象
 */
public class OrderBusiness {

    /**
     * 创建订单的方法
     *
     * @param order 订单的接口对象
     */
    public void saveOrder(OrderApi order) {
        // 1 判断当前的预定产品数量是否大于1000
        while (order.getOrderProductNum() > 1000) {
            // 2 如果大于，还需要继续拆分
            // 2.1 再新创建一份订单，跟传入的订单除了数量不一样外，其他都相同
            OrderApi newOrder = order.cloneOrder();
            // 然后执行赋值，产品数量为1000
            newOrder.setOrderProductNum(1000);
            // 2.2 原来的订单保留，把数量设置成减少1000
            order.setOrderProductNum(order.getOrderProductNum() - 1000);
            // 然后是业务功能处理，省略了，打印输出看一下
            System.out.println("拆分生成订单 == " + newOrder);
        }
        // 3 不超过1000，那就直接业务功能处理，省略了，打印输出，看一下
        System.out.println("拆分（也有可能没有被拆分过）后的订单 == " + order);
    }
}
