package com.isyxf.test.tmp;

public class Pair<T> {
    private T first;
    private T last;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getLast() {
        return last;
    }

    public void setLast(T last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }

    /**
     * 静态泛型
     * @param first
     * @param <K>
     * @return
     */
    public static <K> K createV(K first) {
        return first;
    }

    static void aaa(String a, String b) {
        return;
    }
}
