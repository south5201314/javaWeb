package com.revenge.bookstore.service.impl;

import com.revenge.bookstore.dao.impl.UserDaoImlp;
import com.revenge.bookstore.pojo.User;
import com.revenge.bookstore.service.UserServlet;
import com.revenge.bookstore.utils.DbUtils;

import java.sql.Connection;

/**
 * ClassName UserServletImpl
 * Description TODO
 * Author Sunflower
 * Date 2021/4/27 20:49
 * Version 1.0
 **/
public class UserServletImpl implements UserServlet {
    @Override
    public boolean existsUsername(String username) {
        UserDaoImlp userDaoImlp = new UserDaoImlp();
        User user = userDaoImlp.queryUserByUsername(username);
        return user == null;
    }

    @Override
    public boolean savaRegisUserInfo(User user) {
        UserDaoImlp userDaoImlp = new UserDaoImlp();
        int len = userDaoImlp.savaUser(user);
        return len != -1;
    }

    @Override
    public boolean loginUser(User user) {
        UserDaoImlp userDaoImlp = new UserDaoImlp();
        User usernameAndPassword = userDaoImlp.queryUserByUsernameAndPassword(user.getUsername(), user.getPassword());
        return usernameAndPassword != null;
    }
}
