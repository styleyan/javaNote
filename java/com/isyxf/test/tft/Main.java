package com.isyxf.test.tft;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        // 向上转型、隐式转型、自动转型 ---> 父类引用指向子类实例
        Animal cat = new Cat();
        Animal dog = new Dog();

        animal.eat();
        cat.eat();
        cat.setName("ddd");
        dog.eat();

        System.out.println("=================向下转型=============");
        Cat temp = (Cat)cat;
        temp.eat();
        temp.run();

    }
}
