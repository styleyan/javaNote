package com.isyxf.ioc.demo7;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 属性setter方法注入
 */
public class Main {
    @Test
    public void start() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext7.xml");
        Person person = (Person)applicationContext.getBean("person");

        System.out.println(person);
    }
}
