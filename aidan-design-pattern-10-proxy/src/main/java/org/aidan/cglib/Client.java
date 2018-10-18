package org.aidan.cglib;

/**
 * @author Aidan
 * @创建时间：2018/10/16 下午6:27
 * @描述: cglib动态代理客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        // 张三登录系统创建一了个订单
        Order order = new Order("设计模式", 100, "张三");
        // 创建一个动态代理
        CglibOrderProxy cglibOrderProxy = new CglibOrderProxy();
        // 然后把订单和动态代理联系起来
        Order proxyInstance = (Order) cglibOrderProxy.getProxyInstance(order);


        // 以下就需要使用被代理过的类来操作了
        // 李四想要来修改，那就会报错
        proxyInstance.setOrderNum(123, "李四");

        // 输出order
        System.out.println("李四修改后订单记录没有变化:" + proxyInstance);

        // 张三修改就不会有问题
        proxyInstance.setOrderNum(123, "张三");

        // 再次输出order
        System.out.println("张三修改后的订单记录：" + proxyInstance);
    }
}
