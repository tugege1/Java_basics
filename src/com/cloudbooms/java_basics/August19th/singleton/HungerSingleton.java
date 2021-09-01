package com.cloudbooms.java_basics.August19th.singleton;

public class HungerSingleton {
    //饥汉式  内存浪费
    /**
     * 私有构造器 类不会被实例化
     */
    private HungerSingleton(){
    }

    /**
     * 饿汉模式  创建一个实例
     */
    private static HungerSingleton singleton = new HungerSingleton();

    /**
     * 提供公共方法 输入唯一的对象
     * @return
     */
    public static HungerSingleton getSingleton(){
        return singleton;
    }
}
