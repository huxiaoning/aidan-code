package org.aidan.dao;

import org.aidan.entity.User;

import java.io.Serializable;
import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/11/27 5:22 PM
 * @描述: UserDao
 */
public interface UserDao {

    List<User> findAll();

    User get(Serializable id);

    void update(User user);


    User save(User user);
}
