package com.isyxf.test.my;

import java.util.ArrayList;

public class S extends ArrayList {
    @Override
    public void trimToSize() {
        System.out.println("我是重写的trimToSize");
    }
}
