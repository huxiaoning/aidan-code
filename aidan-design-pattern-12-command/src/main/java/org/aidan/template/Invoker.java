package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/10/20 下午4:02
 * @描述: 调用者
 */
public class Invoker {
    /**
     * 持有命令对象
     */
    private Command command = null;

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 示意方法，要求命令对象执行请求
     */
    public void runommand() {
        command.execute();
    }
}
