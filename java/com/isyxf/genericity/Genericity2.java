package com.isyxf.genericity;

/**
 * @author xiaofei.yan
 * @Create 2020-03-20 14:19
 * @Descript 泛型
 */
public class Genericity2<T> {
    /**
     * 泛型方法
     * @param anArray
     * @param ele
     * @param <T>
     * @return
     */
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T ele) {
        int count = 0;

        for ( T e : anArray) {
            //
            if (e.compareTo(ele) > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] ints = {3,2,22,33,44,11};
    }
}
