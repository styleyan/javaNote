package com.isyxf.spring_ioc_annotate;

import org.springframework.stereotype.Component;

@Component("userService")
public class UserService {
    public String sayName(String name) {
        return "我的名字叫: " + name;
    }
}
