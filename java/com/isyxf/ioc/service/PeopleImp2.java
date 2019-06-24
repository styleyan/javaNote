package com.isyxf.ioc.service;

import org.springframework.stereotype.Service;

@Service("peopleImp2")
public class PeopleImp2 implements People{
    @Override
    public void say() {
        System.out.println("我是imp12, say");
    }

    @Override
    public void run() {
        System.out.println("我是imp12, run");
    }
}
