package com.isyxf.refles;

import com.isyxf.refles.impl.HelloServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xiaofei.yan
 * @Create 2020-05-28 11:00
 * @Descript 反射代理
 */
public class HelloServiceProxy2 implements MethodInterceptor {
    private Object target;

    /**
     * 创建代理对象
     *
     * @param target
     * @return
     */
    public Object getInstance(Object target) {
        this.target = target;
        /**
         * Enhancer: 增强器
         * 它是一个字节码增强器，可以用来为无接口的类创建代理，功能与 java 自带的 Proxy 类挺相似的，会根据某个给定的类创建子类
         * 并且所有非 final 的方法都带有回调钩子。
         */
        Enhancer enhancer = new Enhancer();
        // 获取代理对象的类
        enhancer.setSuperclass(this.target.getClass());
        // 回调方法
        enhancer.setCallback(this);

        return enhancer.create();
    }

    /**
     * 回调方法
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.err.println("########## 我是 CGLIB 的动态代理 #########");

        // 反射方法前调用
        System.err.println("我准备说 hello");
        Object returnObj = methodProxy.invokeSuper(o, objects);
        // 反射方法后调用
        System.err.println("我说过 hello 了");

        return returnObj;
    }

    public static void main(String[] args) {
        HelloServiceProxy2 helloServiceProxy2 = new HelloServiceProxy2();
        HelloService helloService = (HelloService) helloServiceProxy2.getInstance(new HelloServiceImpl());
        String result = helloService.sayHello();

        System.out.println(result);
    }
}
