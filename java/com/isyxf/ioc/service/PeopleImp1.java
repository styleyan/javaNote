package com.isyxf.ioc.service;

import org.springframework.stereotype.Service;

@Service("peopleImp1")
public class PeopleImp1 implements People{
    @Override
    public void say() {
        System.out.println("我是imp11, say");
    }

    @Override
    public void run() {
        System.out.println("我是imp11, run");
    }
}
