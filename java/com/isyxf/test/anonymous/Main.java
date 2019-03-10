package com.isyxf.test.anonymous;

public class Main {
    // 根据传入的不同的人的类型，调用对应的 read 方法
    // 方案1:
    /*public void getRead(Man man) {
        man.read();
    }

    public void getRead(Woman woman) {
        woman.read();
    }*/

    // 方法2:
     public void getRead(Person person) {
        person.read();
     }

    public static void main(String[] args) {
        Main main = new Main();
//        Man one = new Man();
//        Woman two = new Woman();
//
//        main.getRead(one);
//        main.getRead(two);

        main.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("男生");
            }
        });
    }
}
