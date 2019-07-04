package com.isyxf.ioc.demo5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    @Test
    public void start() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext5.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        userDao.find();
        userDao.delete();
        userDao.insert();
        userDao.update();
    }
}
