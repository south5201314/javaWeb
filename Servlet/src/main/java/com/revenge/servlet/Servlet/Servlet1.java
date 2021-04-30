package com.revenge.servlet.Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("我是Servlet1,我要向Servlet2请求转发");
        request.setAttribute("servlet1","开始交易GET");
        request.getRequestDispatcher("/servlet2").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("我是Servlet1,我要向Servlet2请求转发");
        request.setAttribute("servlet1","开始交易POST");
        request.getRequestDispatcher("/servlet2").forward(request,response);
    }
}
