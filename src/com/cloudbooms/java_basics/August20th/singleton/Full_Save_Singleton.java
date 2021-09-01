package com.cloudbooms.java_basics.August20th.singleton;

public class Full_Save_Singleton {

    //懒汉式 线程安全
    //有很好的lazy loding ,能够在多线程很好的工作 但是效率很低
    //第一次调用才初始化，避免内存浪费   加synchronized保证单例，加锁会影响效率
    /**
     *声明实例
     */
    private static Full_Save_Singleton singleton;

    /**
     * 创建私有构造方法
     */
    private Full_Save_Singleton() {
    }

    /**
     * 提供对外获取实例方法
     * @return
     */
    public static synchronized Full_Save_Singleton getInstance() {
        if (singleton == null) {
            singleton = new Full_Save_Singleton();
        }
        return singleton;
    }

}
