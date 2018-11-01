package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/10/30 下午3:01
 * @描述: 客户端测试类
 */
public class Client {
    public static void main(String[] args) {
        FlowAMock mock = new FlowAMock("TestFlow");
        mock.runPhaseOne();
        int tempResult = mock.getTempResult();
        String tempState = mock.getTempState();
        mock.schema1();

        mock.setTempResult(tempResult);
        mock.setTempState(tempState);
        mock.schema2();
    }
}
