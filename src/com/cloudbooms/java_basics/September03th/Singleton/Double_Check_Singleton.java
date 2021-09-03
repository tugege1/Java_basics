package com.cloudbooms.java_basics.September03th.Singleton;

public class Double_Check_Singleton {

    //添加volatile 禁止jvm重排   多线程的话重排会发生问题
    private static volatile Double_Check_Singleton singleton;

    private Double_Check_Singleton() {
    }

    public static Double_Check_Singleton getInstance() {
        //第一次校验后，给类添加锁
        if (singleton == null) {
            synchronized (Double_Check_Singleton.class) {
                //第二次校验
                if (singleton == null) {
                    singleton = new Double_Check_Singleton();
                }
            }
        }
        return singleton;
    }

}
