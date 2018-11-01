package org.aidan.rewrite;


/**
 * @author Aidan
 * @创建时间：2018/10/30 下午4:33
 * @描述: 模拟运行流程A
 */
public class FlowAMock {

    private String flowName;

    private int tempResult;

    private String tempState;

    public FlowAMock(String flowName) {
        this.flowName = flowName;
    }

    /**
     * 示意，运行流程的第1个阶段
     */
    public void runPhaseOne() {
        // 在这个阶段，可能产生了中间结果，示意一下
        tempResult = 3;
        tempState = "PhaseOne";
    }

    /**
     * 示意，按照方案一来运行流程后半部分
     */
    public void schema1() {
        // 示意，需要使用第一个阶段产生的数据
        this.tempState += ",Schema1";
        System.out.println(this.tempState + " : now run " + this.tempResult);
        this.tempResult += 11;
    }

    /**
     * 示意，按照方案二来运行流程后半部分
     */
    public void schema2() {
        // 示意，需要使用第一个阶段产生的数据
        this.tempState += ",Schema2";
        System.out.println(this.tempState + " : now run " + this.tempResult);
        this.tempResult += 22;
    }


    /**
     * 创建保存原发器对象的状态的备忘录对象
     *
     * @return
     */
    public FlowAMockMemento createMemento() {
        return new FlowAMock.MementoImpl(this.tempResult, this.tempState);
    }

    /**
     * 重新设置原发器对象的状态，让其回到备忘录对象记录的状态
     *
     * @param memento
     */
    public void setMemento(FlowAMockMemento memento) {
        MementoImpl mementoImpl = (MementoImpl) memento;
        this.tempResult = mementoImpl.getTempResult();
        this.tempState = mementoImpl.getTempState();
    }

    /**
     * 真正的备忘录对象
     */
    private static class MementoImpl implements FlowAMockMemento {
        private int tempResult;

        private String tempState;

        public MementoImpl(int tempResult, String tempState) {
            this.tempResult = tempResult;
            this.tempState = tempState;
        }

        public int getTempResult() {
            return tempResult;
        }

        public String getTempState() {
            return tempState;
        }
    }
}
