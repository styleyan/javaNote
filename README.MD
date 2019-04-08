# AOP 相关知识

### 术语
````java
public class UserDaoImpl implements UserDao {
    public void save(User user){}
    
    public void update(User user) {}
    
    public List find() {}
    
    public void delete(User user) {}
}
````
- Joinpoint(连接点): 指的是可以被拦截到的点，增删改查这些方法都可以被增强，这些方法称为是连接点。
- Pointcut(切入点): 指的是真正被拦截到的点，只想对save方法进行增强（做权限校验），save方法称为是切入点。
- Advice(通知): 拦截后要做的事情，对save方法要进行权限校验，权限校验的方法称为是通知。
- Target(目标): 被增强的对象。
- Weaving(织入): 将Advice应用到Target的过程，将权限校验应用到UserDaoImpl的save方法这个过程。
- Proxy(代理): 被应用了增强后，产生一个代理对象。
- Aspect(切面): 就是切入点和通知的组合。