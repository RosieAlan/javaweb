package com.itheima;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.sql.*;

public class JDBCTest01 {
    /**
     * JDBC入门程序
     */
    @Test
    public void testUpdate() throws Exception {
        //1. 准备工作
        //1.1 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver"); // 固定的 - 可以省略

        //1.2 获取数据库链接对象 Connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itheima02", "root", "1234");

        //1.3 获取SQL语句执行对象 Statement
        Statement statement = connection.createStatement();

        //2. 执行SQL - DML执行返回值: 代表影响的行数
        int i = statement.executeUpdate("update user set password = '1289' where id = 1");
        System.out.println(i);

        //3. 释放资源
        statement.close();
        connection.close();
    }



}
