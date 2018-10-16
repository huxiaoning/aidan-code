package org.aidan.scene;

import java.util.Collection;

/**
 * @author Aidan
 * @创建时间：2018/10/13 下午3:40
 * @描述: 场景测试客户端类
 */
public class Client {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Collection<UserModel> col = userManager.getUserByDepId("0101");
        System.out.println(col.size());
        System.out.println(col);
    }
}
