package com.isyxf.demo2;

import org.springframework.stereotype.Repository;

@Repository("peopleDao")
public class PeopleDao {
    public void ss() {
        System.out.println("测试 @Resource 注解");
    }
}
