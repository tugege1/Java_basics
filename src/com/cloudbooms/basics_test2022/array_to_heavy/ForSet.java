package com.cloudbooms.basics_test2022.array_to_heavy;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Tu
 * @date 2022/2/8 15:59
 */
public class ForSet {
    public static void main(String[] args) {

        //创建数组的三种方式
        int[] array1 = new int[5];
        int[] array2 = {1, 5, 6, 4, 5, 8, 2, 4, 1};
        int[] array3 = new int[]{1, 5, 6, 4, 5, 8, 2, 4, 1};

        for (int array : array2) {
            System.out.println(array);
        }
        System.out.println();

        //使用set集合不可重复性质进行数组去重。
        //HashSet:底层map集合  LinkedHashSet:底层链表，有序   TreeSet:底层TreeMap
        Set<Integer> set = new LinkedHashSet<>();
        for (int array : array2) {
            set.add(array);
        }

        Object[] objects = set.toArray();

        for (Object obj : objects) {
            System.out.println(obj);
        }

    }
}
