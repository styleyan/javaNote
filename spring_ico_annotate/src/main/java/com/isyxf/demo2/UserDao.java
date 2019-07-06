package com.isyxf.demo2;

import org.springframework.stereotype.Repository;

@Repository("userDao111")
public class UserDao {
    /**
     * 保存用户
     */
    public void save() {
        System.out.println("DAO中保存用户...");
    }
}
