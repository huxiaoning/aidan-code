package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/10/20 下午3:56
 * @描述: 具体的命令对象
 */
public class ConcreteCommand implements Command {

    /**
     * 持有对应的接收者对象
     */
    private Receiver receiver = null;

    /**
     * 示意，命令对象可以有自已的状态
     */
    private String state;


    /**
     * 构造方法，传入相应的接收者对象
     *
     * @param receiver
     */
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 通常会转调接收者对象的相应方法，让接收者来执行真正的功能
        receiver.action();
    }
}
