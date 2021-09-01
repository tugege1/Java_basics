package com.cloudbooms.java_basics.August23th.singleton;

public class Lazy_Save_Singleton {

    private static Lazy_Save_Singleton singleton;

    private Lazy_Save_Singleton() {
    }

    private static synchronized Lazy_Save_Singleton getInstance() {
        if (singleton == null) {
            singleton = new Lazy_Save_Singleton();
        }
        return singleton;
    }
}
