package com.isyxf.demo3;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bean1")
public class Bean1 {

    @PostConstruct
    public void init() {
        System.out.println("initBean...");
    }

    public void say() {
        System.out.println("zhe....");
    }

    @PreDestroy
    public void destory() {
        System.out.println("destoryBean...");
    }
}
