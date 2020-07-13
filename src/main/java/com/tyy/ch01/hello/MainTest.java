package com.tyy.ch01.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainTest {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld("谭于映");
        helloWorld.work();
        System.out.println("========SpringIOC========");
        //创建IOC容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注入实例bean
        //HelloWorld h=(HelloWorld)ac.getBean("h");
        HelloWorld h=ac.getBean(HelloWorld.class);
        h.work();
    }
}
