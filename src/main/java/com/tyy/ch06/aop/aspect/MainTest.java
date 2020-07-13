package com.tyy.ch06.aop.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("ch06_aspect.xml");

        ICount bean = (ICount)ac.getBean("countImpl");
        System.out.println(bean.getClass().getName());

        int result1 = bean.add(10, 20);
        System.out.println("-->result1 = "+result1);

        int result2 = bean.div(20, 10);
        System.out.println("-->result2 = "+result2);
    }

}
