package com.isyf.aop;

import org.junit.Test;

public class Main {

    @Test
    public void demo1() {
        UserDao userDao = new UserDaoImpl();

        UserDao proxy = (UserDao)new MyJdkProxy(userDao).createProxy();


        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.find();
    }
}
