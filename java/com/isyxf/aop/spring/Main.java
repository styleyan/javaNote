package com.isyxf.aop.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Main {

    /**
     * customerDao: 原始, customerDaoProxy: 代理对象
     */
    @Resource(name = "customerDaoProxy")
    private CustomerDao customerDao;

    @Test
    public void demo1() {
        customerDao.find();
        customerDao.delete();
        customerDao.update();
        customerDao.save();
    }
}
