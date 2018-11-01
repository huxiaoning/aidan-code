package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/30 下午4:52
 * @描述: 负责保存模拟运行流程A的对象的备忘录对象
 */
public class FlowAMementoCareTaker {

    private FlowAMockMemento memento;

    public void saveMemento(FlowAMockMemento memento) {
        this.memento = memento;
    }

    public FlowAMockMemento retriveMemento() {
        return memento;
    }
}
