package com.isyxf.ioc.demo10;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    @Test
    public void run() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext10.xml");
        CollectionBean collectionBean = (CollectionBean)applicationContext.getBean("collectionBean");

        System.out.println(collectionBean);
    }
}
