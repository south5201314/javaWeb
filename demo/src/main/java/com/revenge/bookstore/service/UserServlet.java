package com.revenge.bookstore.service;

import com.revenge.bookstore.pojo.User;

/**
 * ClassName UserServlet
 * Description TODO
 * Author Sunflower
 * Date 2021/4/27 20:37
 * Version 1.0
 **/
public interface UserServlet {
    /**
     * 查询用户名是否存在
     * @param name 用户名
     * @return 如果返回true 用户名不存在, false 用户名已存在
     */
    boolean existsUsername(String name);

    /**
     * 把注册的用户名信息保存到数据
     * @param user 用户对象
     * @return
     */
    boolean savaRegisUserInfo(User user);

    /**
     * 查询用户名是否存在,用户名和密码是否正确
     * @param user 用户对象
     * @return 如果返回true 用户名和密码正确, false 用户名不存在和用户名和密码不正确
     */
    boolean loginUser(User user);
}
