package com.isyxf.thread;


import com.isyxf.exception.OperExecption;

/**
 * @author xiaofei.yan
 * @Create 2019-07-18 19:34
 * @Descript 测试
 */
public class Test {
    public static void main(String[] args) {
        try {
            throw new OperExecption("dfdf");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
