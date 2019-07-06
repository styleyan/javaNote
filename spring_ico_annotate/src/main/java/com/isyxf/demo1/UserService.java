package com.isyxf.demo1;

import org.springframework.stereotype.Component;

@Component("userService")
public class UserService {
    public String sayName(String name) {
        return "我的名字叫: " + name;
    }
}
