package com.cloudbooms.java_basics.August19th.singleton;

public class TestSingleton {

    public static void main(String[] args) {
        HungerSingleton s1 = HungerSingleton.getSingleton();
        HungerSingleton s2 = HungerSingleton.getSingleton();
        System.out.println(s1==s2);

        Full_NoSave_Singleton instance = Full_NoSave_Singleton.getInstance();
        Full_NoSave_Singleton instance2 = Full_NoSave_Singleton.getInstance();
        System.out.println(instance==instance2);
    }
}
