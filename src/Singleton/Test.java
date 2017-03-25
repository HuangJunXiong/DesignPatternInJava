package Singleton;

import java.util.concurrent.CountDownLatch;

/**
 * Created by gray on 2017/3/25.
 */
public class Test {
    public static void main(String args[]){
        // 使用闭锁实现同时并发用于测试单例
        final CountDownLatch latch = new CountDownLatch(1);
    }
}
