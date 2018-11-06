package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/11/6 上午10:41
 * @描述: 具体的职责对象，用来处理请求
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest() {
        // 根据某些条件来判断是否属于自已处理的职责范围
        // 判断条件比如，从外部传入的参数，或者这里主动去获取的外部数据
        // 如从数据库中获得等，下面这句话只是上示意
        boolean someCondition = false;
        if (someCondition) {
            // 如果属于自已处理的职责范围，就在这里处理请求
            // 具体的处理代码
            System.out.println("ConcreteHandler2 handle request");
        } else {
            // 如果不属于自已的处理范围，那就判断是否还有后继的职责对象
            // 如果有，就转发请求给后继的职责对象
            // 如果没有，什么都不做，自然结束
            if (successor != null) {
                successor.handleRequest();
            }
        }
    }
}
