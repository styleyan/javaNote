package com.isyxf.refles;

import com.isyxf.refles.impl.HelloServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xiaofei.yan
 * @Create 2020-05-28 11:00
 * @Descript 反射代理
 */
public class HelloServiceProxy implements InvocationHandler {
    /**
     * 真实服务对象
     */
    private Object target;

    /**
     * 绑定委托对象并返回一个代理类
     * @param target
     * @return
     */
    public Object bind(Object target) {
        this.target = target;
        /**
         * 这个代理对象有三个参数，
         * 第一个参数是类加载器，
         * 第二个参数是接口（代理对象挂在哪个接口下）
         * 第三个参数 this 代表当前 HelloServiceProxy，另外一种意思是使用 HelloService 的代理方法作为对象的代理执行者。
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * 通过代理对象调用方法首先进入这个方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("####### 我是 JDK 动态代理 #######");
        Object result;

        // 反射方法前调用
        System.err.println("我准备说hello。");

        // 执行方法，相当于调用 HelloServiceImpl 类的 sayHello 方法
        result = method.invoke(target, args);
        // 反射方法后调用
        System.out.println("我说过 hello 了");

        return result;
    }

public static void main(String[] args) {
    HelloServiceProxy helloHandler = new HelloServiceProxy();
    HelloService proxy = (HelloService)helloHandler.bind(new HelloServiceImpl());

    proxy.sayHello();
}
}
