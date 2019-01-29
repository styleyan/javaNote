package com.isyxf.test;

import com.isyxf.test.PO.Person;
import com.isyxf.test.PO.ResultPO;
import com.isyxf.test.PO.Sth;

public class Main {
    public static void main(String[] args) {

        ResultPO resultPO = new ResultPO();
        Person person = new Person();
        person.setAge(1);
        person.setName("yxf");

        Sth sth1 = new Sth();
        sth1.setBbb("sd");
        Sth sth = new Sth();
        sth.setAaa("sdasdasd" + "sdad");
        sth.setBbb("sdasda");

        resultPO.getP().add(person);
        resultPO.getSth().add(sth);


        System.out.println(resultPO);
    }
}
