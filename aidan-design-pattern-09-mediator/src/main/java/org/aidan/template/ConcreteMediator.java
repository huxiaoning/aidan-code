package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/9/18 下午3:26
 * @描述: 具体的中介者实现
 */
public class ConcreteMediator implements Mediator {

    /**
     * 持有并维护同事A
     */
    private ConcreteColleagueA colleagueA;

    /**
     * 持有并维护同事B
     */
    private ConcreteColleagueB colleagueB;

    /**
     * 设置中介者需要了解并维护的同事A对象
     *
     * @param colleagueA 同事A对象
     */
    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    /**
     * 设置中介者需要了解并维护的同事B对象
     *
     * @param colleagueB 同事B对象
     */
    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void changed(Colleague colleague) {
        // 某个同事发生了变化，通常需要与其他同事交互
        // 具体协调相应的同事对象来实现协作行为
    }
}
