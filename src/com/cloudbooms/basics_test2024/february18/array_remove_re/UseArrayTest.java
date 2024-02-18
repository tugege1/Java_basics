package com.cloudbooms.basics_test2024.february18.array_remove_re;

import java.util.Arrays;

/**
 * 使用数组进行去重，但是新数组长度固定，有问题
 *
 * @author Tu
 * @date 2024/2/18 19:01
 */
public class UseArrayTest {

    public static void main(String[] args) {

        //声明原数组及下标
        int[] oldArray = {3, 1, 3, 5, 4, 3, 2, 2, 3, 1, 7};
        System.out.println(Arrays.toString(oldArray));

        //声明新数组
        int[] newArray = new int[oldArray.length];
        int newArrayIndex = 0;

        //循环数据
        for (int i = 0; i < oldArray.length; i++) {
            //创建循环标记
            boolean isAddFlag = true;
            for (int j = i + 1; j < oldArray.length; j++) {
                if (oldArray[i] == oldArray[j]) {
                    isAddFlag = false;
                    break;
                }
            }
            if (isAddFlag) {
                newArray[newArrayIndex] = oldArray[i];
                newArrayIndex++;
            }
        }

        System.out.println(Arrays.toString(newArray));

    }

}
