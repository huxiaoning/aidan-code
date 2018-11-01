package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/30 下午4:55
 * @描述: 客户端测试类
 */
public class Client {
    public static void main(String[] args) {
        FlowAMock mock = new FlowAMock("TestFlow");

        mock.runPhaseOne();

        FlowAMementoCareTaker careTaker = new FlowAMementoCareTaker();

        FlowAMockMemento memento = mock.createMemento();

        careTaker.saveMemento(memento);

        mock.schema1();

        mock.setMemento(careTaker.retriveMemento());

        mock.schema2();

    }
}
