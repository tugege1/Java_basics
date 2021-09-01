package com.cloudbooms.java_basics.August23th.Remove_Repetition;

import java.util.List;
import java.util.Vector;

public class Use_List {

    public static void main(String[] args) {
        int[] array = {1, 2, 1, 4, 9, 8, 2, 7};

        List<Integer> list = new Vector<>();

        for (int i = 0;i<array.length;i++){
            if(!list.contains(array[i])){
                list.add(array[i]);
            }
        }

        Object[] objects = list.toArray();
        for(Object obj : objects){
            System.out.println(obj);
        }
    }
}
