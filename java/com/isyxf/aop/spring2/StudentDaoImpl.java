package com.isyxf.aop.spring2;

public class StudentDaoImpl implements StudentDao {
    @Override
    public void save() {
        System.out.println("StudentDao,-----保存");
    }

    @Override
    public void delete() {
        System.out.println("StudentDao,-----删除");
    }

    @Override
    public void update() {
        System.out.println("StudentDao,-----更新");
    }
}
