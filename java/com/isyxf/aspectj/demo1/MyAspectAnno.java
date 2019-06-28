package com.isyxf.aspectj.demo1;

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
     */
    @Before(value = "execution(* com.isyxf.aspectj.demo1.ProductDao.save(..))")
    public void before() {
        System.out.println("=================前置通知=====================");
    }
}
