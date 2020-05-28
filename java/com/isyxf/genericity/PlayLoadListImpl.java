package com.isyxf.genericity;


import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaofei.yan
 * @Create 2020-03-20 15:37
 * @Descript ddd
 */
public class PlayLoadListImpl{
    /**
     * 上限有界通配符
     * @param list
     * @return
     */
    public static Double sumOfList(List< ? extends Number> list) {
        double s = 0.0;

        for (Number n : list) {
            s += n.doubleValue();
        }
        return s;
    }

    /**
     * 无界通配符
     * @param list
     */
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem + "");
        }
    }

    /**
     * 下限有界通配符
     * @param list
     */
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        // 上限有界
        List<Number> list = new ArrayList<>();
        list.add(3);
        list.add(11);
        list.add(32);
        Double doubles = PlayLoadListImpl.sumOfList(list);
        System.out.println(doubles);

        // 无界
        List list1 = new ArrayList<>();
        list1.add("hello");
        list1.add(2333);
        list1.add("sdf");
        PlayLoadListImpl.printList(list1);

        // 下限有界
        List<Integer> integerList = new ArrayList<>();
        PlayLoadListImpl.addNumbers(integerList);

        System.out.println(integerList);
    }
}
