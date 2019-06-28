package com.isyxf.aspectj.demo1;

/**
 * 目标类
 */
public class ProductDao {
    public void save() {
        System.out.println("保存商品...");
    }

    public String update() {
        System.out.println("更新商品...");

        return "update";
    }

    public int delete() {
        System.out.println("删除...");
        return 233;
    }

    public void findOne() {
        System.out.println("查询一个...");
    }

    public void findAll() {
        System.out.println("查询所有...");
    }
}
