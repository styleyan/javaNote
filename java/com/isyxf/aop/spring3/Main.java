package com.isyxf.aop.spring3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class Main {
    @Resource(name = "customerDao")
    private CustomerDao customerDao;

    @Resource(name = "studentDao")
    private StudentDao studentDao;
    @Test
    public void start () {
        customerDao.find();
        customerDao.save();

        studentDao.save();
        studentDao.update();
    }
}
