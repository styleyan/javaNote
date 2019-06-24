package com.isyxf.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * JDK动态代理可以对实现接口的类产生代理
 * 1. 必须继承 InvocationHandler 接口
 * 2. 通过 Proxy.newProxyInstance(claassLoader, Interfaces, this) 3个参数
 * 3. 必须实现 InvocationHandler 接口的 invoke 方法
 */

public class MyJdkProxy implements InvocationHandler {
    private UserDao userDao;

    public MyJdkProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    public Object createProxy() {
        Object proxy = Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(),this);
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("save".equals(method.getName())) {
            System.out.println("权限校验");
        }
        return method.invoke(userDao, args);
    }
}
