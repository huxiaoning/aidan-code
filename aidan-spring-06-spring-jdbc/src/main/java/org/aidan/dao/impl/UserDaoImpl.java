package org.aidan.dao.impl;

import org.aidan.dao.UserDao;
import org.aidan.dao.base.impl.BaseDaoImpl;
import org.aidan.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author Aidan
 * @创建时间：2018/11/26 12:17 PM
 * @描述: CustomersDaoImpl
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

}
