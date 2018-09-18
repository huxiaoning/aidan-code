package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/9/18 下午3:18
 * @描述: 具体的同事类B
 */
public class ConcreteColleagueB extends Colleague {
    /**
     * 构造方法，传入中介者对象
     *
     * @param mediator 中介者对象
     */
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    /**
     * 示意方法执行某些业务功能
     */
    public void someOperation() {
        // 在需要跟其他对象勾通的时候，通知中介者对象
        getMediator().changed(this);
    }
}
