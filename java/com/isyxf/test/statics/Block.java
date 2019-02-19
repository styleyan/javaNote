package com.isyxf.test.statics;

import java.util.Date;

/**
 * static关键字还有一个比较关键的作用就是 用来形成静态代码块以优化程序性能。
 * static块可以置于类中的任何地方，类中可以有多个static块。
 * 在类初次被加载的时候，会按照static块的顺序来执行每个static块，并且只会执行一次。
 */

//=======================================旧版本============================
//public class Block {
//    private Date birthDate;
//     
//    public Person(Date birthDate) {
//        this.birthDate = birthDate;
//    }
//     
//    boolean isBornBoomer() {
//        Date startDate = Date.valueOf("1946");
//        Date endDate = Date.valueOf("1964");
//        return birthDate.compareTo(startDate)>=0 && birthDate.compareTo(endDate) < 0;
//    }
//}


    // ===============================优化后版本==========================

/**
 * isBornBoomer是用来这个人是否是1946-1964年出生的，
 * 而每次isBornBoomer被调用的时候，都会生成startDate和birthDate两个对象，
 * 造成了空间浪费，如果改成这样效率会更好
 */
public class Block {
    private Date birthDate;

    private static int startDate, endDate;

    static {
        startDate = 1946;
        endDate = 1960;
    }

    public void Person(Date birthDate) {
        this.birthDate = birthDate;
    }

    boolean isBornBoomer() {
        return startDate >= 0 && endDate < 0;
    }
}
