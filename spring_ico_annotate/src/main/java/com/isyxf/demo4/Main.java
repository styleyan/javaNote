package com.isyxf.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    @Test
    public void run() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4.xml");
        ProductService productService = (ProductService)applicationContext.getBean("productService");

        productService.save();
    }
}
