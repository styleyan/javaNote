package com.isyxf.ioc.demo6;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的构造方法的属性注入
 */
public class Main {
    @Test
    public void start() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext6.xml");
        User user = (User)applicationContext.getBean("user");

        // 得到: User{name='yxf', age=23}
        System.out.println(user.toString());
    }
}
