package com.isyxf.ioc.fj;

import com.alibaba.fastjson.annotation.JSONField;

public class Person {
    @JSONField(name = "acccount_info")
    private String accountInfo = "测试";

    public String getAccountInfo() {
        return accountInfo;
    }

    public void setAccountInfo(String accountInfo) {
        this.accountInfo = accountInfo;
    }
}
