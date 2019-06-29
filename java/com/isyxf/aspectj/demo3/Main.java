package com.isyxf.aspectj.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 采用XML配置的方式完成AOP开发
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class Main {
    @Resource(name = "customerDao")
    private CustomerDao customerDao;

    @Test
    public void run() {
        customerDao.save();
    }
}
