package com.revenge.bookstore.service;

import com.revenge.bookstore.pojo.User;
import com.revenge.bookstore.service.impl.UserServletImpl;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName LoginServlet
 * Description TODO
 * Author Sunflower
 * Date 2021/4/28 0:24
 * Version 1.0
 **/
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UserServletImpl userServlet = new UserServletImpl();
        if (userServlet.loginUser(new User(null, username, password, null))) {
            System.out.println("登录成功");
            req.getRequestDispatcher("/pages/user/login_success.html").forward(req, resp);
        } else {
            System.out.println("登录失败");
            req.getRequestDispatcher("/pages/user/login.html").forward(req, resp);
        }
    }
}
