package com.isyxf.ioc.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    @Test
    public void start() {
        // 通过调用 ClassPathXmlApplicationContext 的 close() 方法触发销毁
        ClassPathXmlApplicationContext applicationContext4 = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Man man4 = (Man)applicationContext4.getBean("man");
        man4.run();
        applicationContext4.close();
    }
}
