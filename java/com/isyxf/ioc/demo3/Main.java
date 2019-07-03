package com.isyxf.ioc.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    @Test
    public void start() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Man man = (Man)applicationContext.getBean("man");
        System.out.println(man);

        // 通过调用 ClassPathXmlApplicationContext 的 close() 方法触发销毁
        ClassPathXmlApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Man man2 = (Man)applicationContext.getBean("man");
        System.out.println(man2);
        applicationContext2.close();
    }
}
