package com.cloudbooms.basics_test2023.January20th.array_remove_re;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 使用无序不可重复集合去重
 *
 * @author Tu
 * @date 2023/1/20 10:56
 */
public class Use_Set {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 3, 34, 5, 2, 2};
        System.out.println(Arrays.toString(array));

        //声明无序集合,set只能实例化其子类. linkedHashset为有序不可重复集合，底层双向链表。
        //Set<Integer> set = new HashSet<>();
        Set<Integer> set = new LinkedHashSet<>();
        Arrays.stream(array).forEach(set::add);

        System.out.println(set);

    }

}
