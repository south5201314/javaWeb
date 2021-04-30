package com.revenge.bookstore.service;

import com.revenge.bookstore.pojo.User;
import com.revenge.bookstore.service.impl.UserServletImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName RegistServlet
 * Description TODO
 * Author Sunflower
 * Date 2021/4/27 21:04
 * Version 1.0
 **/
public class RegistServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String repwd = req.getParameter("repwd");
        String email = req.getParameter("email");
        String code = req.getParameter("code");
        UserServlet userServlet = new UserServletImpl();
        if ("asdf".equalsIgnoreCase(code)) {
            if (userServlet.existsUsername(username)) {
                User user = new User(null, username, password, email);
                if(userServlet.savaRegisUserInfo(user)){
                    System.out.println("注册成功\n注册信息：\n"+user);
                    req.getRequestDispatcher("/pages/user/regist_success.html").forward(req,resp);
                }else {
                    System.out.println("注册失败,服务器异常,请重新注册");
                    req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
                }

            } else {
                System.out.println("用户名[" + username + "]已存在");
            }
        } else {
            System.out.println("验证码错误");
            req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
        }
    }
}
