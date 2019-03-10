package com.isyxf.test.ab;

public interface Comm {
    void eat();
    void run();

    default void connection() {
        System.out.println("我是接口中的默认链接");
    }
}
