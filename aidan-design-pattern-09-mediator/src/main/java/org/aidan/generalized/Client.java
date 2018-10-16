package org.aidan.generalized;

/**
 * @author Aidan
 * @创建时间：2018/9/26 下午4:46
 * @描述: 广义中介者测试客户端类
 */
public class Client {

    public static void main(String[] args) {
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();

        // 准备要撤销的部门，仅仅需要一个部门编号的字段
        Dep dep1 = new Dep();
        dep1.setDepId("d1");
        Dep dep2 = new Dep();
        dep2.setDepId("d2");

        // 准备用于测试的人员，也只需要一个人员编号
        User user1 = new User();
        user1.setUserId("u1");


        // 测试撤销部门
        System.out.println("撤销部门前----------------");
        mediator.showUserDeps(user1);
        // 撤销这个部门
        dep1.deleteDep();
        System.out.println("撤销部门后----------------");
        mediator.showUserDeps(user1);


        System.out.println("----------华丽的分隔线----------------");
        // 测试人员离职
        System.out.println("人员离职前----------------");
        mediator.showDepUsers(dep2);
        // 人员离职
        user1.dimission();
        System.out.println("人员离职后----------------");
        mediator.showDepUsers(dep2);


    }
}
