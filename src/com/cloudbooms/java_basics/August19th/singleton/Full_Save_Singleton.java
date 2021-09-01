package com.cloudbooms.java_basics.August19th.singleton;

public class Full_Save_Singleton {
    // 2:懒汉式-线程安全 加锁Synchronized Syn-chro-nized 效率低

    /**
     * 声明实例
     */
    private static Full_Save_Singleton fullsave;

    /**
     * 私有构造
     */
    private Full_Save_Singleton() {
    }

    /**
     * 提供公共方法
     */
    private static synchronized Full_Save_Singleton getInstance() {
        if (fullsave == null) {
            fullsave = new Full_Save_Singleton();
        }
        return fullsave;
    }
}
