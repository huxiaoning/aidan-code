package org.aidan.dao.impl;

import org.aidan.dao.UserDao;
import org.aidan.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/11/27 5:22 PM
 * @描述: UserDaoImpl
 */
@Repository
@Transactional(rollbackFor = {Exception.class})
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<User> findAll() {
        return currentSession().createCriteria(User.class).list();
    }

    @Override
    public User get(Serializable id) {
        return (User) currentSession().get(User.class, id);
    }

    @Override
    public void update(User user) {
        currentSession().update(user);
    }

    @Override
    public User save(User user) {
        Serializable id = currentSession().save(user);
        System.out.println(id);
        return user;
    }

}
