package com.isyxf.ioc.demo2;

/**
 * Bean的实例化的三种方式, 采用无参的构造方法的方式
 * @author Administrator
 */
public class Bean1 {
    private String name;
    private Integer num;
    private Cat cat;

    public void setName(String name) {
        System.out.println("设置了属性name:" + name);
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Bean1(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Bean1{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", cat=" + cat +
                '}';
    }
}
