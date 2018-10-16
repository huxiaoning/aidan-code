package org.aidan.protectionagent;

/**
 * @author Aidan
 * @创建时间：2018/10/16 下午1:54
 * @描述: 保护代理客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        // 张三登录系统创建了一个订单
        OrderProxy order = new OrderProxy(new Order("设计模式", 100, "张三"));
        // 李四想要来修改，那就会报错
        order.setOrderNum(123, "李四");
        // 输出order
        System.out.println("李四修改后的订单记录没有变化:" + order);

        // 张三修改就不会有问题
        order.setOrderNum(123, "张三");
        // 再次输出order
        System.out.println("张三修改后，订单记录:" + order);
    }
}
