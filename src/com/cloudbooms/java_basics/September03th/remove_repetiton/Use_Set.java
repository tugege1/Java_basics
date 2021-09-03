package com.cloudbooms.java_basics.September03th.remove_repetiton;

import java.util.LinkedHashSet;
import java.util.Set;

public class Use_Set {
    public static void main(String[] args) {

        int[] array = {1, 5, 2, 4, 2, 9, 7, 5};

        for (Integer arr : array) {
            System.out.println(arr);
        }
        System.out.println("");

        //HashSet 底层map   linkedHashSet：底层链表   TreeSet：底层TreeMap
        //实现类都可以  因为Set是无序集合 linkedHashSet不会破坏顺序
        Set set = new LinkedHashSet();

        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

        Object[] objects = set.toArray();

        for (Object obj : objects) {
            System.out.println(obj);
        }
    }
}
