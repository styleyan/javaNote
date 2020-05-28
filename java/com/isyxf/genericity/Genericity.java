package com.isyxf.genericity;

/**
 * @author xiaofei.yan
 * @Create 2020-03-20 14:19
 * @Descript 泛型
 */
public class Genericity<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T:" + t.getClass().getName());
        System.out.println("U:" + u.getClass().getName());
    }

    public static void main(String[] args) {
        Genericity<Integer> integerGenericity = new Genericity<>();
        integerGenericity.setT(new Integer(10));

        integerGenericity.inspect(23);
    }
}
