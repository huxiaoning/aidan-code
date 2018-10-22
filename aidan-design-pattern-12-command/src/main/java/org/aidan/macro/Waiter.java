package org.aidan.macro;

/**
 * @author Aidan
 * @创建时间：2018/10/22 下午5:18
 * @描述: 服务员，负责组合菜单，负责组装每个菜和具体的实现者
 * 还负责执行调用，相当于标准的Command模式的Client + Invoker
 */
public class Waiter {

    /**
     * 持有一个宏命令对象 - 菜单
     */
    private MenuCommand menuCommand = new MenuCommand();

    /**
     * 客户点菜
     *
     * @param cmd
     */
    public void orderDish(Command cmd) {
        // 客户传过来的命令对象是没有和接收者组装的
        // 在这里组装吧
        HotCook hotCook = new HotCook();
        CoolCook coolCook = new CoolCook();

        // 判断到底是组合凉菜师傅还是热菜师傅
        // 简单点根据命令的原始对象的类型来判断
        if (cmd instanceof DuckCommand) {
            cmd.setCookApi(hotCook);
        } else if (cmd instanceof ChopCommand) {
            cmd.setCookApi(hotCook);
        } else if (cmd instanceof PorkCommand) {
            cmd.setCookApi(coolCook);
        }
        menuCommand.addCommand(cmd);
    }

    /**
     * 客户点菜完毕，表示要执行命令了，这里就是执行菜单这个组合命令
     */
    public void orderOver() {
        this.menuCommand.execute();
    }
}
