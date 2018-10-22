package org.aidan.revocable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/10/20 下午5:05
 * @描述: 计算器类    相当于命令模式中的Invoke类
 */
public class Calculator {

    /**
     * 持有加法命令对象
     */
    private Command addCommand = null;

    /**
     * 持有减法命令对象
     */
    private Command substractCommand = null;


    /**
     * 历史命令列表，在撤销的时候有用
     */
    private List<Command> undoCmds = new ArrayList<>();

    /**
     * 命令被撤销的命令记录，在恢复的时候使用
     */
    private List<Command> redoCmds = new ArrayList<>();


    public Command getAddCommand() {
        return addCommand;
    }

    public void setAddCommand(Command addCommand) {
        this.addCommand = addCommand;
    }

    public Command getSubstractCommand() {
        return substractCommand;
    }

    public void setSubstractCommand(Command substractCommand) {
        this.substractCommand = substractCommand;
    }


    public void addPressed() {
        this.addCommand.execute();
        undoCmds.add(this.addCommand);
    }


    public void substractPressed() {
        this.substractCommand.execute();
        undoCmds.add(this.substractCommand);
    }

    public void undoPressed() {
        if (this.undoCmds.size() == 0) {
            System.out.println("很抱歉，没有可以撤销的命令!");
            return;
        }
        // 取最后一个命令来撤销
        Command cmd = this.undoCmds.get(this.undoCmds.size() - 1);
        cmd.undo();
        this.undoCmds.remove(cmd);
        this.redoCmds.add(cmd);
    }

    public void redoPressed() {
        if (this.redoCmds.size() == 0) {
            System.out.println("很抱歉，没有可以恢复的命令");
            return;
        }
        // 取最后一个命令来恢复
        Command cmd = this.redoCmds.get(this.redoCmds.size() - 1);
        cmd.execute();
        this.undoCmds.add(cmd);
        this.redoCmds.remove(cmd);
    }
}
