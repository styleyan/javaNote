package com.isyxf.demo4;

import javax.annotation.Resource;

public class ProductService {
    @Resource(name = "categoryDao")
    private CategoryDao categoryDao;

    @Resource(name = "productDao")
    private ProductDao productDao;

    public void save() {
        categoryDao.save();
        productDao.save();
        System.out.println("ProductService的save方法执行了....");
    }
}
