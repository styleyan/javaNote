package com.isyxf.aop.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Main {

    /** 增强(studentDaoProxy)、没有增强(studentDao), 查看 applicationContext.xml 文件 **/
    @Resource(name = "studentDaoProxy")
    private StudentDao studentDao;

    @Test
    public void demo1() {
        studentDao.find();
        studentDao.save();
        studentDao.update();
        studentDao.delete();
    }
}
