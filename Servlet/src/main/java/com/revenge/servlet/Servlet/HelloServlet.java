package com.revenge.servlet.Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class HelloServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        // 获取 Init-param 初始化参数
        String username = servletConfig.getInitParameter("username");
        String password = servletConfig.getInitParameter("password");
        System.out.println(username);
        System.out.println(password);
        // 获取Servlet别名 <servlet-name>HelloServlet</servlet-name>
        String servletName = servletConfig.getServletName();
        System.out.println(servletName);
        // 获取ServletContext对象
        ServletContext servletContext = servletConfig.getServletContext();

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
