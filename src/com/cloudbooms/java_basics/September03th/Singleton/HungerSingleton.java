package com.cloudbooms.java_basics.September03th.Singleton;

public class HungerSingleton {

    //不添加final，添加后表示常量，必须要就行赋值
    private static HungerSingleton singelton = new HungerSingleton();

    //关键：私有构造器
    private HungerSingleton() {
    }

    //提供对外方法
    public static HungerSingleton getInstance() {
        return singelton;
    }

}
