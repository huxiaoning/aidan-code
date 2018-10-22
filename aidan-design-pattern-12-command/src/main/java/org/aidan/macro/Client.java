package org.aidan.macro;

/**
 * @author Aidan
 * @创建时间：2018/10/22 下午6:02
 * @描述: 宏命令 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        ChopCommand chopCommand = new ChopCommand();
        DuckCommand duckCommand = new DuckCommand();
        PorkCommand porkCommand = new PorkCommand();

        waiter.orderDish(chopCommand);
        waiter.orderDish(duckCommand);
        waiter.orderDish(porkCommand);

        waiter.orderOver();
    }
}
