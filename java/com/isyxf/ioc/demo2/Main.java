package com.isyxf.ioc.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试Bean的实例化的三种方式
 */
public class Main {

    /**
     * 无参构造器的方式
     */
    @Test
    public void demo1() {
         // 创建工厂
         ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
         // 通过工厂活得类的实例
         Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
    }

    /**
     * 静态工厂的方式
     */
    @Test
    public void demo2() {
        // 创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        // 通过工厂活得类的实例
        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
    }

    /**
     * 实例工厂方法实例化
     */
    @Test
    public void demo3() {
        // 创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        // 通过工厂活得类的实例
        Bean3 bean3 = (Bean3) applicationContext.getBean("bean3");
    }
}
