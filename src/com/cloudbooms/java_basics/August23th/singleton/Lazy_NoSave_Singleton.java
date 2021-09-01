package com.cloudbooms.java_basics.August23th.singleton;

public class Lazy_NoSave_Singleton {

    private static Lazy_NoSave_Singleton singleton;

    private Lazy_NoSave_Singleton() {
    }

    private static Lazy_NoSave_Singleton getInstance() {
        if (singleton == null) {
            singleton = new Lazy_NoSave_Singleton();
        }
        return singleton;
    }

}
