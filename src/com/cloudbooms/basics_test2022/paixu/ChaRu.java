package com.cloudbooms.basics_test2022.paixu;

/**
 * 插入排序
 * 定义待插入的数，外层圈数。
 * 再定义一个待插入数的前一个数下标，拿插入数与前面的数一一比较，最后交换
 *
 * @author Tu
 * @date 2022/2/9 10:24
 */
public class ChaRu {
    public static void main(String[] args) {

        int[] array = {8, 5, 4, 2, 9, 7, 6, 3, 1};
        for (int arr : array) {
            System.out.println(arr);
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            //保存待插入的数
            int waitMath = array[i];
            //找到待插入数的前一个元素下标
            int index = i - 1;
            //拿待插入数与前面的数判断，直到完成排序条件
            while (index >= 0 && waitMath < array[index]) {
                //利用下标赋值前一个数
                array[index + 1] = array[index];
                //下标减1，用于赋值待插入的数（大的数字已经赋值到后面）
                index--;
            }
            //赋值待插入的数字(小)
            array[index + 1] = waitMath;
        }

        for (int arr : array) {
            System.out.println(arr);
        }

    }
}
