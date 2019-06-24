package com.isyxf.ioc.service;

import org.springframework.beans.factory.annotation.Autowired;

public class Main {
    @Autowired
    private PeopleImp1 peopleImp1;
    @Autowired
    private PeopleImp2 peopleImp2;

    public void ccc() {
        peopleImp2.run();
        peopleImp1.run();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.ccc();
    }
}
