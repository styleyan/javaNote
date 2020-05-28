# 基本语法

### 泛型类
```java
class Foo<T> {
    private T t;
    
    public T getT() {
        return this.t;
    }
    
    public void setT(T t) {
        this.t = t;
    }
}
```

### 泛型方法
```java
class Foo {
    public static <T> T getAdd(T t1, T t2) {
        return t1 + t2;
    }
}
```

### 上限有界的通配符
上限有界通配符将未知类型限制为该类型的特定类型或子类型，并使用 extends 关键字表示，语法 `<? extends 上限>`
```java
class Foo {
    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        
        for (Number n : list) {
            s += n.doubleValue();
        }
        
        return s;
    }
    
    public static void main(String[] args){
      // 上限有界
      List<Number> list = new ArrayList<>();
      list.add(3);
      list.add(11);
      list.add(32);
      Double doubles = Foo.sumOfList(list);
      System.out.println(doubles);
    }
}
```

### 下限有界通配符
下限有界通配符将未知类型限制为该类型的特定类型或超类型，语法：`<? super 下限>`
```java
class Foo {
    public static void addNumbers(List< ? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
    
    public static void main(String[] args){
      // 下限有界
      List<Integer> integerList = new ArrayList<>();
      PlayLoadListImpl.addNumbers(integerList);

      System.out.println(integerList);
    }
}
```

### 无界通配符
使用通配符 "?" 指定无界通配符类型，例如 `List<?>`，称为位置类型的列表。
适用场景:
- 当前正在编写可以借由 Object 类中的方法来实现的方法。
- 使用泛型类中不依赖于参数的方法时，如 List.size()、List.clear() 等；实际上，经常使用 Class

```java
class Foo {
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem + "");
        }
    }
    public static void main(String[] args){
      // 无界
      List list1 = new ArrayList<>();
      list1.add("hello");
      list1.add(2333);
      list1.add("sdf");
      Foo.printList(list1);
    }
}
```