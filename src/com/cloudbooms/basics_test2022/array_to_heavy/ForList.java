package com.cloudbooms.basics_test2022.array_to_heavy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tu
 * @date 2022/2/8 16:16
 */
public class ForList {
    public static void main(String[] args) {

        //创建数组
        int[] array = {1, 5, 6, 4, 5, 8, 2, 4, 1};

        for (int arr : array) {
            System.out.println(arr);
        }
        System.out.println();

        //使用List进行数组去重
        //ArrayList:底层数组，查询快，增删改慢
        //LinkedList:底层双向链表，增删改快，查询慢
        //Vector:底层数组，线程安全，速度最慢
        List<Integer> list = new ArrayList<>();

        for (int arr : array) {
            if (!list.contains(arr)) {
                list.add(arr);
            }
        }

        Object[] objects = list.toArray();

        for (Object arr : objects) {
            System.out.println(arr);
        }

    }
}
