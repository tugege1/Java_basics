package com.cloudbooms.java_basics.September03th.Singleton;

public class No_Save_Singleton {

    private static No_Save_Singleton singleton;

    private No_Save_Singleton() {
    }

    public static No_Save_Singleton getInstance() {
        if (singleton == null) {
            singleton = new No_Save_Singleton();
        }
        return singleton;
    }
}
