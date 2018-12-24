package org.aidan;

import org.aidan.dao.UserDao;
import org.aidan.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Properties;

/**
 * @author Aidan
 * @创建时间：2018/11/26 11:12 AM
 * @描述: App
 */
@Component
public class App {

    @Autowired
    private Environment env;

    @Autowired
    private Properties properties;


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.aidan.config");
        UserDao userDao = context.getBean(UserDao.class);

        System.out.println("-----------插入一条记录--------------");
        User u = new User();
        u.setUsername("aidan");
        u.setBirthDay(new Date());
        u.setPassword("123");
        u = userDao.save(u);
        System.out.println(u.getId());


//        System.out.println("-----------查询列表--------------");
//        List<User> userList = userDao.findAll();
//        for (User user : userList) {
//            System.out.println(user);
//        }
//        System.out.println("-----------查询单个实体--------------");
//        User user = userDao.find(1);
//        System.out.println(user);
        context.close();
    }
}
