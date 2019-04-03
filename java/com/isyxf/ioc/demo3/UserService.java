package com.isyxf.ioc.demo3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("userService")
@Scope
public class UserService {
    @Value("账单")
    private String sometion;
}
