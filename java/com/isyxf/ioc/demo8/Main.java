package com.isyxf.ioc.demo8;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 属性setter方法注入 - p名称空间
 */
public class Main {
    @Test
    public void start() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext8.xml");
        Person person = (Person)applicationContext.getBean("person");

        System.out.println(person);
    }
}
