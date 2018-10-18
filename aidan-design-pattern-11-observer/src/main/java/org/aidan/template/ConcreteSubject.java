package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/10/18 下午2:29
 * @描述: 具体的目标对象, 负责把有关状态存入到相应的观察者对象
 * 并在自已的状态发生改变时，通知各个观察者
 */
public class ConcreteSubject extends Subject {

    /**
     * 示意，目标对象的状态
     */
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        // 状态发生改变，通知各个观察者
        this.notifyObservers();
    }
}
