package com.cloudbooms.java_basics.August20th.Array_Remove_Repetition;

import java.util.LinkedHashSet;

public class Use_LinkedHashSet {

    public static void main(String[] args) {
        //创建数组
        int[] array = {1, 2, 1, 4, 9, 8, 7};

        //创建 有序、不重复的集合LinkedHashset
        LinkedHashSet link = new LinkedHashSet();

        //遍历数组并添加进集合
        for (int i = 0; i < array.length; i++) {
            link.add(array[i]);
        }

        //将集合转换为数组
        Object[] newArry = link.toArray();

        //遍历去重后的数组
        for (Object arr : newArry) {
            System.out.println(arr);
        }
    }

}
