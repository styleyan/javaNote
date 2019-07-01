package com.isyxf.ioc.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

public class Main {
    @Test
    public void demo1() {
        UserService userService = new UserServiceImpl();
        userService.sayHello();
    }

    @Test
    public void demo2() {
        // 创建spring的工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过工厂获得类:
        UserServiceImpl userService= (UserServiceImpl) applicationContext.getBean("userService");
        userService.sayHello();
        userService.setName("dddd");
        System.out.println(userService.getName());
    }
}
