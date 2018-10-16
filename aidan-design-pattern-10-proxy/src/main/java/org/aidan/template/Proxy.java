package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/10/13 下午4:07
 * @描述: 代理对象
 */
public class Proxy implements Subject {

    /**
     * 持有被代理的具体的目标对象
     */
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }


    @Override
    public void request() {
        // 在转调具体的目标对象前，可以执行一些功能处理

        // 转调具体的目标对象的方法
        realSubject.request();

        // 在转调具体的目标对象后，可以执行一些功能处理
    }
}
