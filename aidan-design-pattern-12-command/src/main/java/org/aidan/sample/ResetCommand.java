package org.aidan.sample;

/**
 * @author Aidan
 * @创建时间：2018/10/20 下午4:27
 * @描述: 重启命令的实现 实现Command接口
 * 持有重启命令的真正实现，通过调用接收者的方法来实现命令
 */
public class ResetCommand implements Command {

    /**
     * 持有真正实现命令的接收者 - 主板对象
     */
    private MainBoardApi mainBoard = null;

    /**
     * 构造器，传入主板对象
     *
     * @param mainBoard
     */
    public ResetCommand(MainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void execute() {
        this.mainBoard.reset();
    }
}
