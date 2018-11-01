package org.aidan.sample1;

import java.util.Collection;

/**
 * @author Aidan
 * @创建时间：2018/10/13 下午5:07
 * @描述: 重写示例模式测试客户端类
 */
public class Client {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Collection<UserModelApi> col = userManager.getUserByDepId("0101");
        // 如果只是显示用户名称，则不需要重新查询数据库
        for (UserModelApi userModel : col) {
            System.out.println("用户编号 = " + userModel.getUserId()
                    + ",用户姓名 = " + userModel.getName());
        }

        System.out.println("-----------华丽的分隔线-----------");

        // 如果非要访问用户编号和用户姓名外的字段，那就会重新查询数据库
        for (UserModelApi userModel : col) {
            System.out.println("用户编号 = " + userModel.getUserId()
                    + ",用户姓名 = " + userModel.getName()
                    + ",所属部门 = " + userModel.getDepId()
            );
        }
    }
}
