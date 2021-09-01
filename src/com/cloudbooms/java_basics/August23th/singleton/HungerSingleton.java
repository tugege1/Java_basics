package com.cloudbooms.java_basics.August23th.singleton;

public class HungerSingleton {

    //浪费资源 初始化就加载
    private static HungerSingleton singleto = new HungerSingleton();

    private HungerSingleton() {
    }

    private static HungerSingleton getInstance() {
        return singleto;
    }

}
