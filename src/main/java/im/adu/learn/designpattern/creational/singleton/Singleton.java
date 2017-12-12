package im.adu.learn.designpattern.creational.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton {

    private static Singleton singletonInstance;
    private static Lock lock = new ReentrantLock();
    private Object singletonData;

    private Singleton() {
        // do something
    }

    public static Singleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

    // 多线程环境中，加锁防止多次实例化
    // 同时，将加锁解锁操作放在if语句中，提高代码运行性能
    public static Singleton getInstanceWithMuiltipleThread() {
//        lock.lock();
//        // 临界区
//        if (singletonInstance == null) {
//            singletonInstance = new Singleton();
//        }
//        lock.unlock();

        if (singletonInstance == null) {
            lock.lock();
            if (singletonInstance == null) {
                singletonInstance = new Singleton();
            }
            lock.unlock();
        }

        return singletonInstance;
    }

    public static void main(String[] args) {
        Singleton singletonA = Singleton.getInstance();
        Singleton singletonB = Singleton.getInstance();
        System.out.println(singletonA == singletonB);
    }

    public Object getSingletonData() {
        return singletonData;
    }

    public void doSomeOerations() {
        // do something here
    }
}
