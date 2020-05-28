package com.isyxf.refles.test;

/**
 * @author xiaofei.yan
 * @Create 2020-03-10 17:45
 * @Descript 书
 */
public class Book {
    private static final String TAG = "BookTag";

    private String name;
    private String author;

    /**
     * 无参构造
     */
    public Book() {}

    /**
     * 有参构造
     * @param name
     * @param author
     */
    private Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 打印
     * @param index
     * @return
     */
    private String declaredMethod(int index) {
        String string = null;

        switch (index) {
            case 0:
                string = "I am declaredMethod 1";
                break;
            case 1:
                string = "I am declaredMethod 2";
                break;
            default:
                string = "I am declaredMethod 1";
        }

        return string;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
