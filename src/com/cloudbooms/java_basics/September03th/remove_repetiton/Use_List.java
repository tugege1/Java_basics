package com.cloudbooms.java_basics.September03th.remove_repetiton;

import java.util.List;
import java.util.Vector;

public class Use_List {
    public static void main(String[] args) {

        int[] array = {1, 5, 2, 4, 2, 9, 7, 5};

        for (Integer arr : array) {
            System.out.println(arr);
        }
        System.out.println("");

        //Arraylist:底层数组   LinkedList:底层双向链表  vector：底层数组(线程安全)
        List list = new Vector();

        for (int i = 0; i < array.length; i++) {
            if (!list.contains(array[i])) {
                list.add(array[i]);
            }
        }

        Object[] objects = list.toArray();

        for (Object obj : objects) {
            System.out.println(obj);
        }

    }
}
