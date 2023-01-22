package com.cloudbooms.basics_test2023.January20th.singleton;

/**
 * 饥汉模式，每次创建一个实例，重复创建
 *
 * @author Tu
 * @date 2023/1/20 10:25
 */
public class HungerSingleton {

    private static HungerSingleton hungerSingleton = new HungerSingleton();

    public HungerSingleton() {
    }

    public static HungerSingleton getHungerSingleton() {
        return hungerSingleton;
    }

}
