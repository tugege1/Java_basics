package com.cloudbooms.java_basics.August20th.Array_Remove_Repetition;

import java.util.Vector;

public class Use_List {

    public static void main(String[] args) {
        //创建数组
        int[] array = {1, 2, 1, 4, 9, 8, 2, 7};

        //创建list集合
        Vector<Integer> list = new Vector<>();

        //使用contains方法判断集合中有没有这个数值
        for (int i = 0; i < array.length; i++) {
            if (!list.contains(array[i])) {
                list.add(array[i]);
            }
        }

        //转为数组
        Object[] objects = list.toArray();

        for (Object obj : objects) {
            System.out.println(obj);
        }

    }
}
