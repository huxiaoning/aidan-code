package org.aidan.generalized;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Aidan
 * @创建时间：2018/9/26 下午4:15
 * @描述: 实现部门和人员交互的中介者实现类
 * 说明：为了演示的简洁性，只示例实现撤销部门和人员离职的功能
 */
public class DepUserMediatorImpl {

    /**
     * 单例的中介者
     */
    private static volatile DepUserMediatorImpl mediator;

    private DepUserMediatorImpl() {
        initTestData();
    }

    public static DepUserMediatorImpl getInstance() {
        if (mediator == null) {
            synchronized (DepUserMediatorImpl.class) {
                if (mediator == null) {
                    mediator = new DepUserMediatorImpl();
                }
            }

        }
        return mediator;
    }


    /**
     * 测试用，记录部门和人员的关系
     */
    private Collection<DepUserModel> depUserCol = new ArrayList<>();

    /**
     * 初始化测试数据
     */
    private void initTestData() {
        // 准备一些测试数据
        DepUserModel du1 = new DepUserModel();
        du1.setDepUserId("du1");
        du1.setDepId("d1");
        du1.setUserId("u1");
        depUserCol.add(du1);

        DepUserModel du2 = new DepUserModel();
        du2.setDepUserId("du2");
        du2.setDepId("d1");
        du2.setUserId("u2");
        depUserCol.add(du2);

        DepUserModel du3 = new DepUserModel();
        du3.setDepUserId("du3");
        du3.setDepId("d2");
        du3.setUserId("u3");
        depUserCol.add(du3);

        DepUserModel du4 = new DepUserModel();
        du4.setDepUserId("du4");
        du4.setDepId("d2");
        du4.setUserId("u4");
        depUserCol.add(du4);

        DepUserModel du5 = new DepUserModel();
        du5.setDepUserId("du5");
        du5.setDepId("d2");
        du5.setUserId("u1");
        depUserCol.add(du5);
    }

    /**
     * 撤销部门
     *
     * @param depId
     * @return
     */
    public boolean deleteDep(String depId) {

        Collection<DepUserModel> tempCol = new ArrayList<>();
        for (DepUserModel du : depUserCol) {
            if (depId.equals(du.getDepId())) {
                tempCol.add(du);
            }
        }
        depUserCol.removeAll(tempCol);
        return true;
    }

    /**
     * 人员离职
     *
     * @param userId
     * @return
     */
    public boolean deleteUser(String userId) {
        Collection<DepUserModel> tempCol = new ArrayList<>();
        for (DepUserModel du : depUserCol) {
            if (userId.equals(du.getUserId())) {
                tempCol.add(du);
            }
        }
        depUserCol.removeAll(tempCol);
        return true;
    }

    /**
     * 测试用，在内部打印显示一个部门下的所有人员
     */
    public void showDepUsers(Dep dep) {
        for (DepUserModel du : depUserCol) {
            if (du.getDepId().equals(dep.getDepId())) {
                System.out.println("部门编号=" + dep.getDepId() + "下面拥有人员，其编号是:" + du.getUserId());
            }
        }
    }

    /**
     * 测试用，在内部打印显示一个人员所属的部门
     */
    public void showUserDeps(User user) {
        for (DepUserModel du : depUserCol) {
            if (user.getUserId().equals(du.getUserId())) {
                System.out.println("人员编号=" + user.getUserId() + ",属于部门:" + du.getDepId());
            }
        }
    }

    /**
     * 人员调换部门
     */
    public boolean changeDep(String userId, String oldDepId, String newDepId) {
        // TODO 不去实现了
        return true;
    }

    /**
     * 部门合并
     */
    public boolean joinDep(Collection<String> colDepIds, Dep newDep) {
        // TODO 不去实现了
        return true;
    }

}
