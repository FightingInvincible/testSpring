package com.tyy.ch04.annotation.test;

import com.tyy.ch04.annotation.controller.DeptController;
import com.tyy.ch04.annotation.entity.Dept;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ac =new ClassPathXmlApplicationContext("annotation.xml");
        Dept dept = ac.getBean(Dept.class);
        System.out.println(dept);
        DeptController deptController=ac.getBean(DeptController.class);
        deptController.find();

    }
}
