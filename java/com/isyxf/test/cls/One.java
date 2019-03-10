package com.isyxf.test.cls;

/**
 * Demo class
 *
 * @author keriezhang
 * @date 2016/10/31
 */
public class One extends AbstractTwo implements Inters {

    private String a = "";

    One() {
        super("ddd");
    }

    One(String cc) {
        System.out.println(cc);
    }

    public String cc() {
        super.ccc("dddd");
        System.out.println("cccc===========eeeee");
        return "test";
    }

    public String getA()  {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public void firstOne() {

    }

    @Override
    public void cf() {
        System.out.println("cf");
    }

    @Override
    public String twoA() {
        return null;
    }

    @Override
    void three(String c) {

    }

    @Override
    void sayName() {

    }

    @Override
    void ccc(String ccc) {
    }
}
