package org.aidan.sample;

/**
 * @author Aidan
 * @创建时间：2018/10/20 下午4:31
 * @描述: 机箱，本身有按钮，持有按钮对应的命令对象
 */
public class Box {
    /**
     * 开机命令对象
     */
    private Command openCommand;
    private Command resetCommand;

    public void setOpenCommand(Command openCommand) {
        this.openCommand = openCommand;
    }

    public void setResetCommand(Command resetCommand) {
        this.resetCommand = resetCommand;
    }

    public void openButtonPressed() {
        openCommand.execute();
    }

    public void resetButtonPressed() {
        resetCommand.execute();
    }
}
