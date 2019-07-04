package com.isyxf.ioc.demo5;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第五步: 初始化前方法...");

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
        System.out.println("第八步: 初始化后方法...");
        String BENA_NAME = "userDao";

        if (!BENA_NAME.equals(beanName)) {
            return bean;
        }

        Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String METHOD = "insert";
                if (METHOD.equals(method.getName())) {
                    System.out.println("权限校验============");
                    // invoke: 引用, TODO: 这东西像 JS 的 function.bind() 方法啊!
                    Object o = method.invoke(bean, args);
                    return o;
                }
                return method.invoke(bean, args);
            }
        });

        return proxy;
    }
}
