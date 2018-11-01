package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/10/20 下午4:27
 * @描述: 开机命令的实现 实现Command接口
 * 持有开机命令的真正实现，通过调用接收者的方法来实现命令
 */
public class OpenCommand implements Command {

    /**
     * 持有真正实现命令的接收者 - 主板对象
     */
    private MainBoardApi mainBoard = null;

    /**
     * 构造器，传入主板对象
     *
     * @param mainBoard
     */
    public OpenCommand(MainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void execute() {
        this.mainBoard.open();
    }
}
