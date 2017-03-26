package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CountDownLatch;

/**
 * Created by gray on 2017/3/25.
 */
public class Test {
    public static void main(String args[]){
        // 使用闭锁实现同时并发用于测试单例
        final CountDownLatch latch = new CountDownLatch(1);
        int threadCount = 100;
        for (int i = 0; i < threadCount; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        latch.await();
//                        System.out.println(ClassicSingleton.getInstance().hashCode());　// 传统单例模式测试 懒汉
//                        System.out.println(ImprovedSingleton.getInstance().hashCode()); // 改进加锁单例模式测试 饿汉
//                        System.out.println(DoubleCheckedLockingSingleton.getInstance().hashCode()); // 双重检查加锁单例模式测试
//                        System.out.println(StaticInnerClassSingleton.getInstance().hashCode()); // 静态内部类单例模式测试
//                        System.out.println(SingletonByEnum.getInstance().hashCode()); // 枚举单例模式测试
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
        latch.countDown();
        // 反射攻击
//        attack();
//        attackModify();
    }

    // 反射攻击测试 饿汉单例为例
    public static void attackModify(){
        Class<?> cls = SingletonNotAttackByReflect.class;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null); // 无参构造函数
            declaredConstructor.setAccessible(true);
            SingletonNotAttackByReflect instance = (SingletonNotAttackByReflect)declaredConstructor.newInstance();
            SingletonNotAttackByReflect instance1 = SingletonNotAttackByReflect.getInstance();
            System.out.println("反射攻击结果："+instance.hashCode());
            System.out.println("正常调用结果："+instance1.hashCode());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    // 反射攻击测试 饿汉单例为例
    public static void attack(){
        Class<?> cls = ImprovedSingleton.class;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null); // 无参构造函数
            declaredConstructor.setAccessible(true);
            ImprovedSingleton instance = (ImprovedSingleton)declaredConstructor.newInstance();
            ImprovedSingleton instance1 = ImprovedSingleton.getInstance();
            System.out.println("反射攻击结果："+instance.hashCode());
            System.out.println("正常调用结果："+instance1.hashCode());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
