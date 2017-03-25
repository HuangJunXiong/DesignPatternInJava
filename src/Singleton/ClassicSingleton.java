package Singleton;

/**
 * Classic Singleton Model
 * lazy instantiaze
 * Created by gray on 2017/3/25.
 */
public class ClassicSingleton {
    private static ClassicSingleton instance;
    private ClassicSingleton(){}
    // 静态的工厂方法
    public static ClassicSingleton getInstance(){
        if (instance == null) {
            instance = new ClassicSingleton();
        }
        return instance;
    }
}
