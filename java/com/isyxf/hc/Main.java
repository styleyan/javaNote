package com.isyxf.hc;

import java.util.*;

/**
 * @author xiaofei.yan
 * @Create 2019-10-17 14:39
 * @Descript 测试
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(22);
        set.add(33);
        set.add(44);

        set.remove(22);

        Iterator<Integer> it = set.iterator();
        // hashNext判断迭代器是否仍有元素

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(11);

        for (Integer i : list) {
            System.out.println(i);
        }

        Map map = new HashMap();


    }
}
