package org.aidan.queue;


import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Aidan
 * @创建时间：2018/10/22 下午5:11
 * @描述: 菜单对象，是个宏命令对象
 */
public class MenuCommand implements Command {

    /**
     * 桌号
     */
    private int tableNum;

    /**
     * 用来组合本菜单的多道菜品，也就是多个命令对象
     */
    private Collection<Command> col = new ArrayList<>();


    public void addCommand(Command cmd) {
        col.add(cmd);
    }

    @Override
    public void execute() {
        CommandQueue.addMenu(this);
    }

    @Override
    public void setCookApi(CookApi cookApi) {

    }

    @Override
    public int getTableNum() {
        return this.tableNum;
    }

    public Collection<Command> getCommands() {
        return this.col;
    }
}
