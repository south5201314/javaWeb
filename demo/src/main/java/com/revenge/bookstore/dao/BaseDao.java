package com.revenge.bookstore.dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName BaseDao
 * Description TODO
 * Author Sunflower
 * Date 2021/4/27 14:58
 * Version 1.0
 **/

public abstract class BaseDao<T> {
    /**
     * 通用的数据库增、删、改操作
     *
     * @param coon 数据库连接对象,方法内不进行回收连接对象
     * @param sql 查询语句
     * @param args 填充占位符参数
     * @return 数据库中数据被影响的数量
     */
    private Class aClass = null;

    {
        Type genericSuperclass = this.getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        aClass = (Class) parameterizedType.getActualTypeArguments()[0];
    }

    /**
     *
     * @param coon 数据库连接对象
     * @param sql SQL语句
     * @param args 站位符填充参数
     * @return 返回数据库中被影响的数据的数量
     * @throws SQLException
     */
    public int update(Connection coon, String sql, String... args) throws SQLException {
        QueryRunner runner = new QueryRunner();
        return runner.update(coon, sql, args);
    }

    /**
     * 查询表中的数据
     *
     * @param conn 数据库连接对象,方法内不进行回收连接对象
     * @param sql  查询语句
     * @param args 填充占位符参数
     * @return 返回查询结果集合
     * @throws SQLException SQL语句错误
     */
    public List<T> queryForList(Connection conn, String sql, String... args) throws SQLException {
        QueryRunner runner = new QueryRunner();
        return runner.query(conn, sql, new BeanListHandler<T>(aClass), args);
    }

    /**
     * 查询一行一列的特殊数据
     *
     * @param conn 数据库连接对象,方法内不进行回收连接对象
     * @param sql  查询语句
     * @param args 填充占位符参数
     * @return 返回结果对象
     * @throws SQLException SQL语句错误
     */
    public Object queryForOne(Connection conn, String sql, String... args) throws SQLException {
        QueryRunner runner = new QueryRunner();
        return runner.query(conn, sql, new ScalarHandler(), args);
    }
}
