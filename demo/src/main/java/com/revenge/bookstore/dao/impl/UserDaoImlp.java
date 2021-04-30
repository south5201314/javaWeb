package com.revenge.bookstore.dao.impl;

import com.revenge.bookstore.dao.BaseDao;
import com.revenge.bookstore.dao.UserDao;
import com.revenge.bookstore.pojo.User;
import com.revenge.bookstore.utils.DbUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * ClassName UserDaoImlp
 * Description TODO
 * Author Sunflower
 * Date 2021/4/27 15:41
 * Version 1.0
 **/

public class UserDaoImlp extends BaseDao<User> implements UserDao {
    @Override
    public User queryUserByUsername(String username) {
        Connection conn = DbUtils.getConnection();
        System.out.println(conn);
        String sql = "SELECT `id`,`username`,`password`,`email` FROM `userlogininfo` WHERE `username`= ?";
        try {
            List<User> userList = queryForList(conn, sql, username);
            if (userList.size() > 0) {
                return userList.get(0);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                DbUtils.closeResources(conn);
            }
        }
        return null;
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        Connection conn = DbUtils.getConnection();
        String sql = "SELECT `id`,`username`,`password`,`email` FROM `userlogininfo` WHERE `username`= ? AND `password` = ?";
        try {
            List<User> userList = queryForList(conn, sql, username, password);
            if (userList.size() > 0) {
                return userList.get(0);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                DbUtils.closeResources(conn);
            }
        }
        return null;
    }

    @Override
    public int savaUser(User user) {
        Connection conn = DbUtils.getConnection();
        String sql = "INSERT INTO `userlogininfo`(`username`,`password`,`email`) VALUES(?,?,?)";
        try {
            return update(conn, sql, user.getUsername(), user.getPassword(), user.getEmail());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                DbUtils.closeResources(conn);
            }
        }
        return -1;
    }
}
