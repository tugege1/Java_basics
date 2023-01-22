package com.cloudbooms.basics_test2023.January20th.singleton;

/**
 * 双重校验锁，同时兼容线程安全及对象复用
 *
 * @author Tu
 * @date 2023/1/20 10:32
 */
public class DoubleCheckSingleton {

    /**
     * volatile 禁止jvm优化，自动指令重排
     */
    private static volatile DoubleCheckSingleton doubleCheckSingleton;

    public DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getDoubleCheckSingleton() {
        //进行第一次校验
        if (doubleCheckSingleton == null) {
            //锁对象，进行第二次校验
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }

}
