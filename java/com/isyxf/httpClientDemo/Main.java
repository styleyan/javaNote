package com.isyxf.httpClientDemo;

import com.alibaba.fastjson.JSONObject;

/**
 * @author xiaofei.yan
 * @Create 2019-08-25 22:05
 * @Descript 测试代理
 */
public class Main {
    public static void main(String[] args) {
        Test test = new Test();

        JSONObject jsonObject = test.getPrxyInfo();

        String result = test.sendProxy(jsonObject, "", "http://127.0.0.1:8080/api/remarkableWriting/add");

        System.out.println(result);

    }
}
