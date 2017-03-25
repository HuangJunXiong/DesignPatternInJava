package Singleton;

/**
 * Improved Singleton Mode
 * eagerly instantiaze
 * To ensure thread safety
 * Created by gray on 2017/3/25.
 */
public class ImprovedSingleton {
    private static final ImprovedSingleton instance = new ImprovedSingleton();
    private ImprovedSingleton(){}
    public static ImprovedSingleton getInstance(){
        return instance;
    }
}
