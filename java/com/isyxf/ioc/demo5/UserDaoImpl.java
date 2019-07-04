package com.isyxf.ioc.demo5;

public class UserDaoImpl implements UserDao {
    @Override
    public void find() {
        System.out.println("查找=====");
    }

    @Override
    public void delete() {
        System.out.println("删除=====");
    }

    @Override
    public void update() {
        System.out.println("更新=====");
    }

    @Override
    public void insert() {
        System.out.println("添加=====");
    }
}
