package com.isyxf.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaofei.yan
 * @Create 2019-08-16 18:32
 * @Descript 测试过滤
 */
public class Fl {
    public static void main(String[] args) {
        List<String> aaa = new ArrayList<String>();

        aaa.add("wwww");

        System.out.println(aaa.contains("wwwwfff"));
    }
}
