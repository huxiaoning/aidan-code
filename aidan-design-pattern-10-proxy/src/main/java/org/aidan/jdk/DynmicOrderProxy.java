package org.aidan.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Aidan
 * @创建时间：2018/10/16 下午2:05
 * @描述: 使用Java中的动态代理
 */
public class DynmicOrderProxy implements InvocationHandler {

    /**
     * 被代理的对象
     */
    private OrderApi order;

    /**
     * 绑定
     *
     * @param order
     * @return
     */
    public OrderApi getProxyInterface(OrderApi order) {
        // 设置被代理的对象,好方便invoke里面的操作
        this.order = order;
        // 把真正的订单对象和动态代理关联起来
        OrderApi orderApi = (OrderApi) Proxy.newProxyInstance(order.getClass().getClassLoader(), order.getClass().getInterfaces(), this);
        return orderApi;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (!method.getName().startsWith("set")) {
            // 不是调用的setter方法，直接执行
            return method.invoke(order, args);
        }

        // 调用setter方法需要检查权限
        // 如果不是创建人，那就不能修改
        if (order.getOrderUser() == null || !order.getOrderUser().equals(args[1])) {
            System.out.println("对不起," + args[1] + ",您无权修改本订单中的数据!");
            return null;
        }

        // 是创建人调用setter方法,可以操作
        return method.invoke(order, args);
    }
}
