package com.cloudbooms.basics_test2023.January20th.array_remove_re;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 使用List有序可重复集合进行数组去重
 *
 * @author Tu
 * @date 2023/1/20 10:38
 */
public class Use_List {

    public static void main(String[] args) {
        //初始化数组的三种方式
        int[] array = new int[4];
        int[] array2 = {1, 2, 3, 4, 5, 1, 4, 5};
        int[] array3 = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array2));

        //声明有序集合，有序集合可重复，需要判断是否存在
        List<Integer> list = new ArrayList<>();
        Arrays.stream(array2).forEach(e -> {
            if (!list.contains(e)) {
                list.add(e);
            }
        });

        System.out.println(list);
    }

}
