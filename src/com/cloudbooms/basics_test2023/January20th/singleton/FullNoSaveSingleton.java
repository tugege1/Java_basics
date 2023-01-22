package com.cloudbooms.basics_test2023.January20th.singleton;

/**
 * 饱汉不安全模式，当没有实例时，重新创建。有的话使用之前的
 *
 * @author Tu
 * @date 2023/1/20 10:27
 */
public class FullNoSaveSingleton {

    private static FullNoSaveSingleton fullNoSaveSingleton;

    public FullNoSaveSingleton() {
    }

    public static FullNoSaveSingleton getFullNoSaveSingleton() {
        if (fullNoSaveSingleton == null) {
            fullNoSaveSingleton = new FullNoSaveSingleton();
        }
        return fullNoSaveSingleton;
    }

}
