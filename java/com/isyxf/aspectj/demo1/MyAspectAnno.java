package com.isyxf.aspectj.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面类
 */
@Aspect
public class MyAspectAnno {
    /**
     * 所有方法执行之前进行加强
     * @Before(value = "execution(* com.isyxf.aspectj.demo1.ProductDao.*(..))")
     **/
    /**
     * 只对 save 方法增强
     * 在方法中传入 JoinPoint 对象, 用来获取切点信息
     */
    @Before(value = "execution(* com.isyxf.aspectj.demo1.ProductDao.save(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("=================前置通知=====================" + joinPoint);
    }

    /**
     * 环绕通知
     * 如果不调用 ProceedingJoinPoint 的 proceed 方法，那么表方法就被拦截了
     */
    @Around("execution(* com.isyxf.aspectj.demo1.ProductDao.delete(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("====================环绕前通知=====================");
        Object object = joinPoint.proceed();
        System.out.println("====================环绕后通知=====================" + object);
        return object;
    }

    /**
     * 后置通知
     * 通过第二个参数 returning, 可以获取到方法返回值
     */
    @AfterReturning(value = "execution(* com.isyxf.aspectj.demo1.ProductDao.update(..))", returning = "result")
    public void afterReturing(Object result) {
        System.out.println("后置通知=====================" + result);
    }

    /**
     * 异常处理通知, 只有出现异常才会执行
     * 通过第二个参数 throwing，可以设置发生异常对象参数
     */
    @AfterThrowing(value = "execution(* com.isyxf.aspectj.demo1.ProductDao.findOne(..))", throwing = "e")
    public void afterThrowing(Throwable e) {
        System.out.println("异常抛出通知==============" + e.getMessage());
    }

    /**
     * 无论是否出现异常，最终通知总是会被执行的
     */
    @After(value = "execution(* com.isyxf.aspectj.demo1.ProductDao.findAll(..))")
    public void after() {
        System.out.println("==========After============");
    }
}
