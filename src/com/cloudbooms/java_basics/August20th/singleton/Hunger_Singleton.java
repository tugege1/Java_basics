package com.cloudbooms.java_basics.August20th.singleton;

public class Hunger_Singleton {

    //每次类加载时就初始化，浪费内存  没有加锁，效率会提高
    /**
     * 创建实例
     */
    private static Hunger_Singleton singleton = new Hunger_Singleton();

    /**
     * 私有构造
     */
    private Hunger_Singleton(){
    }

    /**
     * 提供对外获取实例方法
     * @return
     */
    public static Hunger_Singleton getInstance(){
        return singleton;
    }
}
