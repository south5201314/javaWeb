package com.revenge.bookstore.test;

import com.revenge.bookstore.utils.DbUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * ClassName DbUtilsTest
 * Description TODO
 * Author Sunflower
 * Date 2021/4/27 14:41
 * Version 1.0
 **/
public class DbUtilsTest {
    @Test
    public void getConnectionTest() {
//        Connection connection = DbUtils.getConnection();
//        System.out.println(connection);
        for (int i = 0; i < 100; i++) {
            Connection connection = DbUtils.getConnection();
            System.out.println(connection);
            DbUtils.closeResources(connection);
        }
    }
}
