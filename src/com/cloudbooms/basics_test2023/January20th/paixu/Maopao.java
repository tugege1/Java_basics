package com.cloudbooms.basics_test2023.January20th.paixu;

import java.util.Arrays;

/**
 * 冒泡练习
 *
 * @author Tu
 * @date 2023/1/22 16:39
 */
public class Maopao {

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 5, 6, 4, 9, 4};
        int temp;

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            //标记位默认跳出循环，当发生排序时继续循环。没有更改状态则为排序成功
            boolean isReplace = true;
            for (int j = 0; j < array.length - (i + 1); j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isReplace = false;
                }
            }
            if (isReplace) {
                break;
            }
        }

        System.out.println(Arrays.toString(array));
    }

}
