package org.aidan.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/10/27 下午4:55
 * @描述: 排序客户端测试类
 */
public class Client {


    private static List<UserModel> userList = new ArrayList<UserModel>() {{
        add(new UserModel("u1", "user1", 23));
        add(new UserModel("u2", "user2", 22));
        add(new UserModel("u3", "user3", 21));
        add(new UserModel("u4", "user4", 24));
    }};

    private static void printList() {
        for (UserModel userModel : userList) {
            System.out.println(userModel);
        }
    }


    public static void main(String[] args) {
        // 直接使用Collections.sort来排序
        a();
    }

    private static void a() {
        System.out.println("---------------排序前---------------");
        printList();
        Collections.sort(userList, new Comparator<UserModel>() {
            @Override
            public int compare(UserModel u1, UserModel u2) {
                // 假如实现按年龄升序排序(小的放前面，老的放后面)
                if (u1.getAge() > u2.getAge()) {
                    return 1;
                } else if (u1.getAge() == u2.getAge()) {
                    return 0;
                } else if (u1.getAge() < u2.getAge()) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println("---------------排序后---------------");
        printList();


    }
}
