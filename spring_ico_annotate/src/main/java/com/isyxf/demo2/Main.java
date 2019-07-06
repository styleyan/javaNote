package com.isyxf.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    @Test
    public void start() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserService userService = (UserService)applicationContext.getBean("userService");

        userService.sayEat();
        userService.save();
        userService.ss();
    }
}
