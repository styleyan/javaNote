package com.isyxf.test.results;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    private static final String ccc = "dddd";

    public List<Results> getList() {
        List<Results> list = new ArrayList();

        Results results = new Results();
        People people = new People();

        people.setAdd("江西省上饶市广丰县");
        people.setName("yxf");

        results.setAa("aa");
        results.setBb("bb");

        list.add(results);
//        list.add(people);

        return list;
    }
}
