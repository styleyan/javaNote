package com.isyxf.aspectj.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

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
     * 后置通知
     * 通过第二个参数 returning, 可以获取到方法返回值
     */
    @AfterReturning(value = "execution(* com.isyxf.aspectj.demo1.ProductDao.update(..))", returning = "result")
    public void afterReturing(Object result) {
        System.out.println("后置通知=====================" + result);
    }

    /**
     * 环绕通知
     */
    @Around("execution(* com.isyxf.aspectj.demo1.ProductDao.delete(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("====================环绕前通知=====================");
        // 如果不调用 ProceedingJoinPoint 的 proceed 方法，那么表方法就被拦截了
        Object object = joinPoint.proceed();
        System.out.println("====================环绕后通知=====================" + object);
        return object;
    }
}
