package Singleton;

/**
 * Created by gray on 2017/3/26.
 */
public class SingletonNotAttackByReflect {
    private static boolean flag = false;
    private static final SingletonNotAttackByReflect instance = new SingletonNotAttackByReflect();
    private SingletonNotAttackByReflect(){
        // 修改构造器，抵御通过反射机制调用私有构造函数
        synchronized (SingletonNotAttackByReflect.class){
            if (flag == false) {
                flag = !flag;
            } else { // 非法调用构造函数，抛出异常
                throw new RuntimeException("You can only call the constructor once!!!");
            }
        }
    }
    public static SingletonNotAttackByReflect getInstance(){
        return instance;
    }
}
