package com.isyxf.ioc.demo6;

public class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
