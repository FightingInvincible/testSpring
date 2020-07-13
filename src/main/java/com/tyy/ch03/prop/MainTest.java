package com.tyy.ch03.prop;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainTest {
    public static void main(String[] args) throws SQLException {
        //创建IOC
        ApplicationContext ac=new ClassPathXmlApplicationContext("prop.xml");
        //注入实例
        ComboPooledDataSource dataSource=ac.getBean(ComboPooledDataSource.class);
        System.out.println(dataSource);
        //获得连接对象
        Connection conn =dataSource.getConnection();
        //创建语句对象
        PreparedStatement preparedStatement=conn.prepareStatement("select uid from user where username=?");
        //给？传参
        preparedStatement.setString(1,"tyy");
        //返回结果集
        ResultSet resultSet=preparedStatement.executeQuery();
        //处理结果集
        while (resultSet.next()){
            String uid=resultSet.getString(1);
            System.out.println(uid);
        }
        //关闭资源
        if (resultSet!=null){
            resultSet.close();
        }
        if (preparedStatement!=null){
            preparedStatement.close();
        }
        if (conn!=null){
            conn.close();
        }
        if (dataSource!=null){
            dataSource.close();
        }
    }
}
