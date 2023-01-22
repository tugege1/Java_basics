package com.cloudbooms.basics_test2023.January20th.array_remove_re;

import java.util.Arrays;

/**
 * 使用数组进行去重，数组去重最后选择，有问题
 *
 * @author Tu
 * @date 2023/1/20 11:12
 */
public class Use_array {

    public static void main(String[] args) {
        int[] array = {1, 3, 1, 4, 4, 6, 2, 6, 7};

        System.out.println(Arrays.toString(array));

        //声明新数组及下标
        int[] newArray = new int[array.length];
        int newArrayIndex = 0;

        for (int i = 0; i < array.length; i++) {
            //创建循环标记
            boolean isAdd = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isAdd = false;
                    break;
                }
            }
            if (isAdd) {
                newArray[newArrayIndex] = array[i];
                newArrayIndex++;
            }
        }

        System.out.println(Arrays.toString(newArray));

    }

}
