package org.aidan.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Aidan
 * @创建时间：2018/10/16 下午6:18
 * @描述: cglib动态代理类
 */
public class CglibOrderProxy implements MethodInterceptor {

    /**
     * 持有被代理的对象
     */
    private Order order;

    /**
     * 相当于动态代理中的绑定
     *
     * @param order
     * @return
     */
    public Object getProxyInstance(Order order) {
        // 初始化被代理的对象
        this.order = order;
        // 创建加强器，用来创建动态代理类
        Enhancer enhancer = new Enhancer();
        // 为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
        enhancer.setSuperclass(this.order.getClass());
        //设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦截
        enhancer.setCallback(this);
        // 创建动态代理类对象并返回
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
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
