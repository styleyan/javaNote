package com.isyxf.aop.cglib;

import org.junit.Test;

public class Main {
    @Test
    public void demo() {
        ProductDao productDao = new ProductDao();

        ProductDao proxy = (ProductDao)new MyCglibProxy(productDao).createProxy();

        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.find();
    }
}
