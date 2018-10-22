package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/10/20 下午4:05
 * @描述: 命令模式模板代码客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command concreteCommand = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(concreteCommand);

        invoker.runommand();
    }
}
