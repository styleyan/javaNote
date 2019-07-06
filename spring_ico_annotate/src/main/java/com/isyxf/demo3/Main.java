package com.isyxf.demo3;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.reflect.generics.scope.Scope;

public class Main {
    @Test
    public void start() {
        /**
         * TODO: 想要调用 销毁方法就必须使用 ClassPathXmlApplicationContext 类型
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Bean1 bean1 = (Bean1)applicationContext.getBean("bean1");

        bean1.say();
        applicationContext.close();
    }

    @Test
    public void start2() {
        /**
         * TODO: 想要调用 销毁方法就必须使用 ClassPathXmlApplicationContext 类型
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        /* 说明2个地址是一样的 */
        Bean2 bean1 = (Bean2)applicationContext.getBean("bean2");
        Bean2 bean2 = (Bean2)applicationContext.getBean("bean2");
        System.out.println(bean1 == bean2);


        /* 在 Bean2 中采用，@Scope("prototype") 就会采用多例方式创建 */
        Bean3 bean3 = (Bean3)applicationContext.getBean("bean3");
        Bean3 bean4 = (Bean3)applicationContext.getBean("bean3");
        System.out.println(bean3 == bean4);

    }
}
