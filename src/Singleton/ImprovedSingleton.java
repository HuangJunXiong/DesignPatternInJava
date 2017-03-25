package Singleton;

/**
 * Improved Singleton Mode
 * eagerly instantiaze
 * To ensure thread safety
 * Created by gray on 2017/3/25.
 */
public class ImprovedSingleton {
    private static ImprovedSingleton instance = new ImprovedSingleton();
    private static int i = 1;
    private ImprovedSingleton(){
        // 修改构造器，抵御通过反射机制调用私有构造函数
        if (i == 1) {
            i++;
        } else { // 非法调用构造函数，抛出异常
            throw new RuntimeException("You can only call the constructor once!!!");
        }
    }
    public static ImprovedSingleton getInstance(){
        return instance;
    }
}
