package com.revenge.bookstore.test;

import com.revenge.bookstore.pojo.User;
import com.revenge.bookstore.service.impl.UserServletImpl;
import junit.framework.TestCase;

public class UserServletImplTest extends TestCase {

    public void testExistsUsername() {
        UserServletImpl userServlet = new UserServletImpl();
        System.out.println(userServlet.existsUsername("131321"));
    }

    public void testSavaRegisUserInfo() {
        UserServletImpl userServlet = new UserServletImpl();
        System.out.println(userServlet.savaRegisUserInfo(new User(null, "666666", "666666", "666666@qq.com")));
    }

    public void testLoginUser() {
        UserServletImpl userServlet = new UserServletImpl();
        System.out.println(userServlet.loginUser(new User(null, "admin", "ad6min", null)));
    }

    public void test(){
        for(int i = 1;i<=9;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
}