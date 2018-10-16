package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/10/13 下午4:04
 * @描述: 具体的目标对象, 是真正被代理的对象
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        // 执行具体的功能处理
    }
}
