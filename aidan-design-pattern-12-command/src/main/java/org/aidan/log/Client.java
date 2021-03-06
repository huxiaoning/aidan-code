package org.aidan.log;

/**
 * @author Aidan
 * @创建时间：2018/10/23 上午11:07
 * @描述: 命令模式的队列请求 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        // 先要启动后台，让整个程序运行起来
        CookManager.runCookManager();

        // 为了简单，直接用循环模拟多个桌号点菜
        for (int i = 0; i < 5; i++) {
            // 创建服务员
            Waiter waiter = new Waiter();
            // 创建命令对象，就是要点的菜
            ChopCommand chopCommand = new ChopCommand(i);
            DuckCommand duckCommand = new DuckCommand(i);
            // 点菜，就是把这些菜让服务记录下来
            waiter.orderDish(chopCommand);
            waiter.orderDish(duckCommand);
            // 点菜完毕
            waiter.orderOver();
        }
    }
}
