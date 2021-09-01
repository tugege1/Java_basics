package com.cloudbooms.java_basics.August19th.singleton;

public class Full_NoSave_Singleton {
    // 1:懒汉式-线程不安全

    /**
     * 声明实例
     */
    private static Full_NoSave_Singleton fullSingleton;

    /**
     * 私有构造器  禁止类实例化
     */
    private Full_NoSave_Singleton() {
    }

    /**
     * 提供对外获取实例方法
     */
    public static Full_NoSave_Singleton getInstance() {
        if (fullSingleton == null) {
            fullSingleton = new Full_NoSave_Singleton();
        }
        return fullSingleton;
    }
}
