package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/10/18 下午2:36
 * @描述: 具体的观察者对象, 实现更新方法，使用自身的状态和目标的状态保持一致
 */
public class ConcreteObserver implements Observer {

    /**
     * 示意，观察者的状态
     */
    private String observerState;

    @Override
    public void update(Subject subject) {
        // 具体的更新实现
        // 这里可能需要更新观察都的状态，使其与目标的状态一致
        observerState = ((ConcreteSubject) subject).getSubjectState();
    }
}
