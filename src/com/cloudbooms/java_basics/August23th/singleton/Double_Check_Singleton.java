package com.cloudbooms.java_basics.August23th.singleton;

public class Double_Check_Singleton {

    private static volatile Double_Check_Singleton singleton;

    private Double_Check_Singleton() {
    }

    private static Double_Check_Singleton getInstance() {
        if (singleton == null) {
            synchronized (Double_Check_Singleton.class) {
                if (singleton == null) {
                    singleton = new Double_Check_Singleton();
                }
            }
        }
        return singleton;
    }

}
