package com.cloudbooms.basics_test2024.february18.array_remove_re;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 使用有序集合进行去重
 *
 * @author Tu
 * @date 2024/2/18 19:13
 */
public class UserListTest {

    public static void main(String[] args) {

        //声明原数组及下标
        int[] oldArray = {3, 1, 3, 5, 4, 3, 2, 2, 3, 1, 7};
        System.out.println(Arrays.toString(oldArray));

        //声明有序集合，有序集合可重复，需要判断是否已存在
        List<Integer> intList = new ArrayList<>();
        Arrays.stream(oldArray).forEach(e -> {
            if (!intList.contains(e)) {
                intList.add(e);
            }
        });

        System.out.println(intList);

    }

}
