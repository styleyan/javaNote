package com.isyxf.ioc.demo9;

public class ProductInfo {
    /**
     * 随机打折
     * @return
     */
    public Double calculatePrice() {
        return Math.random() * 199;
    }
}
