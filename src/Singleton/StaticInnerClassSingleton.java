package Singleton;

/**
 * use static Inner Class
 * Created by gray on 2017/3/25.
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){}
    private static class InnerClass {
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }
    public static final StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }
}
