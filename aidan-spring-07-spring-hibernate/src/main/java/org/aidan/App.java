package org.aidan;

import org.aidan.dao.UserDao;
import org.aidan.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.aidan.config");

        context.start();

        UserDao userDao = context.getBean(UserDao.class);
        List<User> userList = userDao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }

        System.out.println("=============");
        User user = userDao.get("7fc57db1880f4c0791287841d4bcf3c1");
        System.out.println(user);
        user.setUsername("Aidan");
        userDao.update(user);
        User u = userDao.get("7fc57db1880f4c0791287841d4bcf3c1");
        System.out.println(u);


        System.out.println("================");
         user = new User();
         user.setUsername("aaa");
         user.setBirthDay(new Date());
         user.setPassword("bbb");
//         user.setId("3333");
        User save = userDao.save(user);

        context.stop();
    }
}
