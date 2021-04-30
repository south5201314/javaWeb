package com.revenge.servlet.Servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * ClassName HelleHttpServlet
 * Description TODO
 * Author Sunflower
 * Date 2021/4/30 13:31
 * Version 1.0
 **/
public class HelleHttpServlet extends HttpServlet {
   // 在GET请求时调用
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        // 在通过继承HttpServlet类的Servlet程序中可以通过以下三中方式获取ServletContext对象
//        // 通过Request对象获取
//        // ServletContext servletContext = req.getServletContext();
//        // 通过ServletConfig对象获取
//        // ServletContext servletContext = getServletConfig().getServletContext();
//        // 通过getServletContext()方法获取
//        ServletContext servletContext = getServletContext();
//        // 获取context-param全局初始化参数
//        String url = servletContext.getInitParameter("url");
//        System.out.println(url);
//        String driver = servletContext.getInitParameter("Driver");
//        System.out.println(driver);
//        // 获取当前工程路径
//        String path = servletContext.getContextPath();
//        System.out.println(path);
//        // 获取当前工程在硬盘上的路径
//        String realPath = servletContext.getRealPath("/");
//        System.out.println(realPath);
//        // 存储数据
//        servletContext.setAttribute("key","value");
//        // 获取数据
//        Object value = servletContext.getAttribute("key");
        String key = req.getParameter("key");
        String mkey = new String(key.getBytes(StandardCharsets.ISO_8859_1),StandardCharsets.UTF_8);
    }
    // 在POST请求时调用
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String key = req.getParameter("key");
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("Context-Type","text/html;charset=UTF-8");
    }
}
