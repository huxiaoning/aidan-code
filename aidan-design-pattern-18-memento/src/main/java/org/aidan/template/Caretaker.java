package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/10/30 下午3:59
 * @描述: 负责保存备忘录的对象
 */
public class Caretaker {

    /**
     * 记录被保存的备忘录对象
     */
    private Memento memento = null;

    /**
     * 保存备忘录对象
     *
     * @param memento
     */
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

    /**
     * 获取被保存的备忘录对象
     *
     * @return
     */
    public Memento retriveMemento() {
        return this.memento;
    }
}
