package com.isyxf.ioc.fj;
import com.alibaba.fastjson.JSON;
import org.junit.Test;

public class Main {
    @Test
    public void test() {
        Person person = new Person();
        person.setAccountInfo("yxf_");
        System.out.println(JSON.toJSONString(person));

        person.getClass();
        person.getClass().getClass();
    }
}
