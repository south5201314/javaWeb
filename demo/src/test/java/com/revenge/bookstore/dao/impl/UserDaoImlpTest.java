package com.revenge.bookstore.dao.impl;

import com.revenge.bookstore.pojo.User;
import junit.framework.TestCase;

public class UserDaoImlpTest extends TestCase {

    public void testQueryUserByUsername() {
        UserDaoImlp userDaoImlp = new UserDaoImlp();
        User admin = userDaoImlp.queryUserByUsername("admin2222");
        System.out.println(admin);
    }

    public void testQueryUserByUsernameAndPassword() {
        UserDaoImlp userDaoImlp = new UserDaoImlp();
        User admin = userDaoImlp.queryUserByUsernameAndPassword("admin","admin");
        System.out.println(admin);
    }

    public void testSavaUser() {
        UserDaoImlp userDaoImlp = new UserDaoImlp();
        int len = userDaoImlp.savaUser(new User(null, "12487489", "12487489", null));
        System.out.println(len);
    }
}