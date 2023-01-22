package com.cloudbooms.basics_test2023.January20th.singleton;

/**
 * 饱汉加锁线程安全模式，当没有实例时，重新创建。有的话使用之前的
 *
 * @author Tu
 * @date 2023/1/20 10:29
 */
public class FullSaveSingleton {

    private static FullSaveSingleton fullSaveSingleton;

    public FullSaveSingleton() {
    }

    public static synchronized FullSaveSingleton getFullSaveSingleton() {
        if (fullSaveSingleton == null) {
            fullSaveSingleton = new FullSaveSingleton();
        }
        return fullSaveSingleton;
    }

}
