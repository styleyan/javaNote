package com.isyxf.test.ext;

public class Two extends One {
    @Override
    public String sayStr(String aaaa, Integer ccc) {
        System.out.println("我是重写后的方法");
        System.out.println(ccc);
        return aaaa;
    }
}
