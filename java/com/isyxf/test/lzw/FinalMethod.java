package com.isyxf.test.lzw;

class Parents {
    private final void doit() {
        System.out.println("父类.doit()");
    }
    final void doit2() {
        System.out.println("父类.doit2()");
    }
    public void doit3() {
        System.out.println("父类.doit3()");
    }
}

class Sub extends Parents {
    public final void doit() {
        System.out.println("子类.doit()");
    }

//    final void doit2() {
//        System.out.println("子类.doit2()");
//    }

    public void doit3() {
        System.out.println("子类.doit3()");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        Sub sub = new Sub();  // 实例化
        sub.doit();

        Parents p = sub;   // 执行向上转型操作

        // p.doit();  // 不能调用 private 方法

        p.doit2();
        p.doit3();
    }
}
