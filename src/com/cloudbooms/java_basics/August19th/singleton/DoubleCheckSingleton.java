package com.cloudbooms.java_basics.August19th.singleton;

public class DoubleCheckSingleton {

    /**
     * volatile 是防止jvm指令重排优化，保证在多线程下也能正常执行
     */
    private static volatile DoubleCheckSingleton singleton;

    private DoubleCheckSingleton() {
    }

    private static DoubleCheckSingleton getSingleton() {
        //第一次校验DoubleCheckSingleton 是否为空
        if (singleton == null) {
            //使用类对象锁  锁住类的方法，一个线程将类对象锁住后，就不能被其他线程访问了
            synchronized (DoubleCheckSingleton.class) {
                //第二次校验DoubleCheckSingleton 是否为空
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
