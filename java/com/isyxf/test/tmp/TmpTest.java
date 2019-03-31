package com.isyxf.test.tmp;

public class TmpTest {
    private String cc;
    private String bb;
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }

    @Override
    public String toString() {
        return "TmpTest{" +
                "cc='" + cc + '\'' +
                ", bb='" + bb + '\'' +
                ", num=" + num +
                '}';
    }
}
