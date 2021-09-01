package com.cloudbooms.java_basics.August20th.singleton;

public class Full_NoSave_Singleton {

    //懒汉式 线程不安全  在多线程时无法正常工作
    // 两个线程同时进入公共方法内，都为空创建两个实例，不符合我们的要求
    /**
     * 声明实例
     */
    private static Full_NoSave_Singleton fullSingleton;

    /**
     * 私有构造方法
     */
    private Full_NoSave_Singleton() {
    }

    /**
     * 提供对外获取实例方法
     * @return
     */
    private static Full_NoSave_Singleton getInstance() {
        if (fullSingleton == null) {
            fullSingleton = new Full_NoSave_Singleton();
        }
        return fullSingleton;
    }

}
