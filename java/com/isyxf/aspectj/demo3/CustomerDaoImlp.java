package com.isyxf.aspectj.demo3;

public class CustomerDaoImlp implements CustomerDao {
    @Override
    public void save() {
        System.out.println("保存客户");
    }

    @Override
    public void update() {
        System.out.println("更新客户");
    }

    @Override
    public void delete() {
        System.out.println("删除客户");
    }

    @Override
    public void findOne() {
        System.out.println("查找一个客户");
    }

    @Override
    public void findAll() {
        System.out.println("查找全部客户");
    }
}
