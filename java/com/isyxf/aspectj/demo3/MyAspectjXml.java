package com.isyxf.aspectj.demo3;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectjXml {
    // 前置通知
    public void beforeHandle() {
        System.out.println("XML方式的前置通知===============");
    }

    // 后置通知
    public void afterRuningHandle(Object result) {
        System.out.println("XML方式的后置置通知=============" + result);
    }

    // 环绕通知
    public Object aroundRuningHandle(ProceedingJoinPoint point) throws Throwable {
        System.out.println("xml方式的环绕通知前");
        Object obj = point.proceed();
        System.out.println("xml方式的环绕通知后:" + obj);
        return obj;
    }
}
