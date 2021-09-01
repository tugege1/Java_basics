package com.cloudbooms.java_basics.August23th.Remove_Repetition;

import java.util.LinkedHashSet;

public class User_Set {

    public static void main(String[] args) {
        int[] array = {1, 5, 6, 5, 7, 8, 8};

        //Set set = new HashSet();
        LinkedHashSet<Integer> set = new LinkedHashSet();

        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

        Object[] objects = set.toArray();

        for (Object arr : objects) {
            System.out.println(arr);
        }
    }
}
