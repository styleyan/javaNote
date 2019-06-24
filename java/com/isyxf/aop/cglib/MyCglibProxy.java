package com.isyxf.aop.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * Cglib代理
 * 1. 必须继承 MethodInterceptor 接口
 * 2. 通过 new Enhancer() 类
 * 3. 必须实现 MethodInterceptor 接口的 intercept 方法
 */
public class MyCglibProxy implements MethodInterceptor {
    private ProductDao productDao;

    public MyCglibProxy(ProductDao productDao) {
        this.productDao = productDao;
    }

    public Object createProxy() {
        // 1. 创建核心类
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类
        enhancer.setSuperclass(productDao.getClass());
        // 3. 设置回调
        enhancer.setCallback(this);
        // 4. 生成代理
        Object proxy = enhancer.create();

        return proxy;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if ("save".equals(method.getName())) {
            System.out.println("权限校验=======");
        }

        // 执行代理类的父类方法，就相当于调用 productDao 方法
        return methodProxy.invokeSuper(proxy, args);
    }
}
