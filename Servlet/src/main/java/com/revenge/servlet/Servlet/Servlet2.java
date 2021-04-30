package com.revenge.servlet.Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("我是servlet2的doGet");
        Object get = request.getAttribute("servlet1");
        if("开始交易GET".equals(get)){
            System.out.println("我是servlet2,交易成功GET,欢迎下次合作");
        }
        Object post = request.getAttribute("servlet1");
        if("开始交易POST".equals(post)){
            System.out.println("我是servlet2,交易成功POST,欢迎下次合作");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object get = request.getAttribute("servlet1");
        if("开始交易GET".equals(get)){
            System.out.println("我是servlet2,交易成功GET,欢迎下次合作");
        }
        Object post = request.getAttribute("servlet1");
        if("开始交易POST".equals(post)){
            System.out.println("我是servlet2,交易成功POST,欢迎下次合作");
        }
    }
}
