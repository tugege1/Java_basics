package com.cloudbooms.java_basics.August20th.Array_Remove_Repetition;

import java.util.HashSet;
import java.util.Set;

public class Use_Set_1 {

    public static void main(String[] args) {
        /**
         * 使用带有不可重复性的集合，进行元素过滤  set以及它的实现类，包括Treeset,ArraySet实现了Set和Collections
         * 这里使用set，但是顺序会乱
         */

        //创建数组
        int[] array = {1, 2, 1, 4, 9, 8, 7};
        //创建set无需集合  set的实现类也可以
        Set set = new HashSet();
        //添加进set集合
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        //转数组 toArray默认是Object类型数组
        Object[] objects = set.toArray();
        //转换为int数组bu'z
        int[] newArray = new int[objects.length];
        for (int i = 0;i< objects.length;i++){
            newArray[i] = (int)objects[i];
        }

        //遍历
        for (int obj: newArray) {
            System.out.println(obj);
        }
    }

}
