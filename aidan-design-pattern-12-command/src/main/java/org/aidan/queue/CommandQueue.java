package org.aidan.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/10/23 上午9:24
 * @描述: 命令队列类
 */
public class CommandQueue {

    /**
     * 用来存储命令对象的队列
     */
    private static final List<Command> cmds = new ArrayList<>();

    /**
     * 服务员传过来一个新的菜单
     * 因为同时会有很多的服务员传入菜单，而同时又有很多厨师在从队列里取值
     *
     * @param menuCommand 传入的菜单
     */
    public synchronized static void addMenu(MenuCommand menuCommand) {
        for (Command cmd : menuCommand.getCommands()) {
            cmds.add(cmd);
        }
    }

    /**
     * 厨师从命令队列里面获取令对象进行处理，也是需要同步的
     *
     * @return
     */
    public synchronized static Command getOneCommand() {
        Command command = null;
        if (cmds.size() > 0) {
            // 取出队列中的第1个，因为是约定按照加入的先后来处理
            command = cmds.get(0);
            // 同时从队列里面删除这个命令对象
            cmds.remove(command);
        }
        return command;
    }
}
