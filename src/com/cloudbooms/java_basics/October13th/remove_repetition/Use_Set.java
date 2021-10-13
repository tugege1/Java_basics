package com.cloudbooms.java_basics.October13th.remove_repetition;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class Use_Set {
    public static void main(String[] args) {

        //创建重复数组
        int[] array = {11, 55, 77, 88, 77, 33, 66, 11};

        for (int arr : array) {
            System.out.println(arr);
        }

        //HashSet:无序不可重复，底层hashmap(使用hashcode查找元素，使用equals决定是否存储)数组+链表+红黑树，线程不安全
        HashSet hashSet = new HashSet();
        //LinkedHashSet:有序不可重复(使用链表维护顺序)，底层是LinkedHashMap(HashSet的子类)数组+链表，线程不安全
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        //TreeSet:有序不可重复，底层是TreeMap红黑树,线程不安全
        TreeSet treeSet = new TreeSet();

        //线程安全方式
        //一：使用Colletcions这个工具类syn方法类创建个线程安全的set.
        Set<String> synSet = Collections.synchronizedSet(new HashSet<>());
        //二：使用JUC包里面的CopyOnWriteArraySet
        Set<String> copySet = new CopyOnWriteArraySet<>();


        for (int i = 0; i < array.length; i++) {
            linkedHashSet.add(array[i]);
        }

        Object[] newArray = linkedHashSet.toArray();

        System.out.println("");
        for (Object newArr : newArray) {
            System.out.println(newArr);
        }
    }
}
