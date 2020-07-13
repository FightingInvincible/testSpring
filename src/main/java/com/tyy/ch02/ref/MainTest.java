package com.tyy.ch02.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        //注入时用.class必须要当前xml只有一个相应class的实例beana
        Person p = (Person) ac.getBean("person");
        System.out.println(p);
    }
}
