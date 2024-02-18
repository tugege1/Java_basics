package com.cloudbooms.basics_test2024.february18.paixu;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author Tu
 * @date 2024/2/18 19:38
 */
public class MaoPao {

    public static void main(String[] args) {
        //杂乱数组
        int[] array = {1, 3, 2, 5, 6, 4, 9, 4};
        System.out.println(Arrays.toString(array));

        //声明临时数据
        int temp;

        //外层控制待排序数据
        for (int i = 0; i < array.length; i++) {
            //标记位默认跳出循环，当发生排序时继续循环。没有更改状态则为排序成功
            boolean isReplace = true;
            //内层控制被排序数据，注意下标越界
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
