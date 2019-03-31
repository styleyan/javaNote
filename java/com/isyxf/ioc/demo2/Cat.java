package com.isyxf.ioc.demo2;

public class Cat {
    private Integer size;
    private String name;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
