package com.isyxf.test.statics;

public class Example {
    public static void sayHello() {
        System.out.println("Hello, everybody");

    }

    public void sayBye() {
        System.out.println("Good Bye~");
    }

    public void saySomething() {
        this.sayHello();
        sayHello();
        Example.sayHello();
        this.sayBye();
    }
}
