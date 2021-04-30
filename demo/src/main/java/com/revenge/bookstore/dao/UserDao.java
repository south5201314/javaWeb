package com.revenge.bookstore.dao;

import com.revenge.bookstore.pojo.User;

/**
 * ClassName UserDao
 * Description TODO
 * Author Sunflower
 * Date 2021/4/27 15:33
 * Version 1.0
 **/
public interface UserDao {
    /**
     * 通过用户名查询用户信息
     * @param username 用户名
     * @return 如果返回null,用户不存在,反之亦然
     */
    User queryUserByUsername(String username);
    /**
     * 通过用户名和密码查询用户信息
     * @param username 用户名
     * @param password 密码
     * @return 如果返回null,用户名不存在或密码错误,反之亦然
     */
    User queryUserByUsernameAndPassword(String username,String password);

    /**
     * 保存用户信息到数据库
     * @param user 用户数据对象
     * @return 返回-1操作失败,反之亦然
     */
    int savaUser(User user);
}
