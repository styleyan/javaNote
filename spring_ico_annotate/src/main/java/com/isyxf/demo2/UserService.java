package com.isyxf.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("userService")
public class UserService {
    @Value("吃饭")
    private String eat;
    /**
     * @Autowired  是按类来进行注入的, 只要相同的类即可
     * @userDao111 是设置定指定名称, 要和 @Repository("xxx") 的值保持一致
     *
     * 2个一起用就强制按照名称来注入
     */
    @Autowired
    @Qualifier("userDao111")
    private UserDao userDao;

    /**
     * @Resource 相关当于 @Autowired、 @Qualifier一起用
     */
    @Resource(name = "peopleDao")
    private PeopleDao peopleDao;

    public String sayName(String name) {
        return "我的名字叫: " + name;
    }

    public void sayEat() {
        System.out.println(eat);
    }

    public void save() {
        System.out.println("service中保存用户...");
        userDao.save();
    }

    public void ss() {
        System.out.println("service中ss...");
        peopleDao.ss();
    }
}
