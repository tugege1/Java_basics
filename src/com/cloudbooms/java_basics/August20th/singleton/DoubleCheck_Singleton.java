package com.cloudbooms.java_basics.August20th.singleton;

public class DoubleCheck_Singleton {

    /**
     * 声明实例  注意添加volatile禁止jvm重排
     */
    //重排序可以提高性能  单个线程重排2，3步骤没问题（只要在4上面就可以,不会影响结果)
    //不加的话          但多线程时，B可能判断时，A线程进行了重排序，b获取不到实例，就会重新创建
    private static volatile DoubleCheck_Singleton singleton;

    /**
     * 私有构造方法
     */
    private DoubleCheck_Singleton() {
    }

    /**
     * 提供获取实例方法
     * @return
     */
    //第一次检查instance不为null，那么就不需要执行下面的加锁和初始化操作。因此可以大幅降低synchronized带来的性能开销
    public static DoubleCheck_Singleton getInstance() {
        //第一次校验
        if (singleton == null) {
            //加锁
            synchronized (DoubleCheck_Singleton.class) {
                //第二次校验
                if (singleton == null) {
                    //创建完成之后，以后访问getInstance就可以直接获取实例
                    singleton = new DoubleCheck_Singleton();
                }
            }
        }
        return  singleton;
    }
}
