package Singleton;

/**
 * Effective Java Recommended method
 * Created by gray on 2017/3/25.
 */
enum  SingletonByEnum {
    INSTANCE;
    public static SingletonByEnum getInstance(){
        return  INSTANCE;
    }
}
