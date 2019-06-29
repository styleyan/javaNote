package com.isyxf.aspectj.demo2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面类
 */
@Aspect
public class MyAspectAnno {

    /**
     * Pointcut方法
     */
    @Pointcut(value = "execution(* com.isyxf.aspectj.demo2.ProductDao.save(..))")
    private void myPointcut(){};

    /**
     * 只对 save 方法增强
     * 在方法中传入 JoinPoint 对象, 用来获取切点信息
     */
    @Before(value = "myPointcut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("===========save======前置通知=====================" + joinPoint);
    }

    /**
     * 后置通知
     * 通过第二个参数 returning, 可以获取到方法返回值
     */
    @AfterReturning(value = "myPointcut()", returning = "result")
    public void afterReturing(Object result) {
        System.out.println("后置通知=====================" + result);
    }


    /**
     * 无论是否出现异常，最终通知总是会被执行的
     */
    @After(value = "myPointcut()")
    public void after() {
        System.out.println("==========After============");
    }
}
