package org.aidan.log;

/**
 * @author Aidan
 * @创建时间：2018/10/23 上午10:35
 * @描述: 服务员, 负责组合菜单,还负责执行调用
 */
public class Waiter {

    /**
     * 持有一个宏命令对象菜单
     */
    private MenuCommand menuCommand = new MenuCommand();

    /**
     * 客户点菜
     */
    public void orderDish(Command cmd) {
        // 添加到菜单中
        menuCommand.addCommand(cmd);
    }

    /**
     * 客户点菜完毕，表示要执行命令了，这里就是执行菜单这个组合的命令
     */
    public void orderOver() {
        this.menuCommand.execute();
    }
}
