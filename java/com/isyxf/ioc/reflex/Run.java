package com.isyxf.ioc.reflex;

public class Run {
    static final void star(String cls) {
        try {
            Class c = Class.forName(cls);
            OfficeBetter test1 = (OfficeBetter) c.newInstance();
            test1.up();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
