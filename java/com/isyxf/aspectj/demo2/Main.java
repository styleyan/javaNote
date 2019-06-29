package com.isyxf.aspectj.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class Main {
    @Resource(name = "productDao")
    private ProductDao productDao;

    @Test
    public void start() {
        Object result = productDao.delete();
        System.out.println("result: " + result);
        productDao.findOne();
        productDao.save();
        productDao.update();
    }
}
