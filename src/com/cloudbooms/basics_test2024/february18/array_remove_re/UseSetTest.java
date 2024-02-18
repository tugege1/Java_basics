package com.cloudbooms.basics_test2024.february18.array_remove_re;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 使用无序集合进行数组去重
 *
 * @author Tu
 * @date 2024/2/18 19:27
 */
public class UseSetTest {

    public static void main(String[] args) {

        //声明原数组及下标
        int[] oldArray = {3, 1, 3, 5, 4, 3, 2, 2, 3, 1, 7};
        System.out.println(Arrays.toString(oldArray));

        Set<Integer> intSet = new HashSet<>();

        Arrays.stream(oldArray).forEach(intSet::add);

        System.out.println(intSet);

    }

}
