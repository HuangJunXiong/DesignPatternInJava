package Singleton;

/**
 * double-checked locking
 * To ensure thread safety
 * Created by gary on 2017/3/25.
 */
public class DoubleCheckedLockingSingleton {
    private volatile static DoubleCheckedLockingSingleton instance;
    private DoubleCheckedLockingSingleton(){}
    public static  DoubleCheckedLockingSingleton getInstance(){
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class){
                if (instance == null) {
                   instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
