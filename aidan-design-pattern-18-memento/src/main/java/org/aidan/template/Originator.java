package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/10/30 下午3:55
 * @描述: 原发器对象
 */
public class Originator {

    /**
     * 示意，表示原发器的状态
     */
    private String state = "";

    /**
     * 创建保存原发器对象的状态的备忘录对象
     *
     * @return
     */
    public Memento createMemento() {
        return new MementoImpl(state);
    }

    /**
     * 重新设置原发器对象的状态，让其回到备忘录对象记录的状态
     *
     * @param memento
     */
    public void setMemento(Memento memento) {
        MementoImpl mementoImpl = (MementoImpl) memento;
        this.state = mementoImpl.getState();
    }

    /**
     * 真正的备忘录对象
     */
    private static class MementoImpl implements Memento {
        /**
         * 示意，表示需要保存的状态
         */
        private String state;

        public MementoImpl(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}
