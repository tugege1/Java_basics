package com.cloudbooms.java_basics.September03th.Singleton;

public class Save_Singleton {

    private static Save_Singleton singleton;

    private Save_Singleton() {
    }

    public static synchronized Save_Singleton getInstance() {
        if (singleton == null) {
            singleton = new Save_Singleton();
        }
        return singleton;
    }
}
