package com.isyxf.ioc.demo9;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    @Test
    public void start() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext9.xml");
        Product product = (Product)applicationContext.getBean("product");

        System.out.println(product);
    }
}
