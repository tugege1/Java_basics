package com.cloudbooms.java_basics.October13th.remove_repetition;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Use_List {
    public static void main(String[] args) {

        //创建重复数组
        int[] array = {11, 55, 77, 88, 77, 33, 66, 11};

        for (int arr : array) {
            System.out.println(arr);
        }

        //ArrayList:有序可重复，底层数组适合查询，线程不安全
        ArrayList arrayList = new ArrayList();
        //LinkedList:有序可重复，底层双向链表适合增删改操作，线程不安全
        LinkedList linkedList = new LinkedList();
        //Vector:有序可重复，底层数组，线程安全。
        Vector vector = new Vector();

        for (int i = 0; i < array.length; i++) {
            //注意，是非，不包含再添加
            if (!arrayList.contains(array[i])) {
                arrayList.add(array[i]);
            }
        }

        Object[] obj = arrayList.toArray();

        System.out.println("");
        for (Object o : obj) {
            System.out.println(o);
        }

    }
}
