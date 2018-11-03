package org.aidan.unshare;

/**
 * @author Aidan
 * @创建时间：2018/11/2 下午6:20
 * @描述: 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        SecurityMgr mgr = SecurityMgr.getInstance();
        mgr.login("张三");
        mgr.login("李四");

        boolean f1 = mgr.hasPermit("张三", "薪资数据", "查看");
        boolean f2 = mgr.hasPermit("李四", "薪资数据", "查看");
        boolean f3 = mgr.hasPermit("李四", "薪资数据", "修改");

        System.out.println("f1 == " + f1);
        System.out.println("f2 == " + f2);
        System.out.println("f3 == " + f3);

        for (int i = 0; i < 3; i++) {
            mgr.login("张三" + i);
            mgr.hasPermit("张三" + i, "薪资数据", "查看");
        }
    }
}
