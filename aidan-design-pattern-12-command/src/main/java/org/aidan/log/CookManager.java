package org.aidan.log;

/**
 * @author Aidan
 * @创建时间：2018/10/23 上午10:54
 * @描述: 后厨管理类，通过此类让后厨的厨师进行运行
 */
public class CookManager {

    /**
     * 用来控制是否需要创建厨师，如果已经创建了就不要再执行了
     */
    private static boolean runFlag = false;

    /**
     * 运行厨师管理，创建厨师对象并启动他们相应的线程
     * 无论运行多少次,创建厨师对象和启动线程的工作只做一次
     */
    public static void runCookManager() {
        if (!runFlag) {
            runFlag = true;
            HotCook cook1 = new HotCook("张三");
            HotCook cook2 = new HotCook("李四");
            HotCook cook3 = new HotCook("王五");

            // 启动他们的线程

            new Thread(cook1).start();
            new Thread(cook2).start();
            new Thread(cook3).start();
        }
    }
}
