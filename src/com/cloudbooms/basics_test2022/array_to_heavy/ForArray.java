package com.cloudbooms.basics_test2022.array_to_heavy;

/**
 * @author Tu
 * @date 2022/2/8 16:34
 */
public class ForArray {
    public static void main(String[] args) {

        //创建数组
        int[] array = {1, 5, 6, 4, 5, 8, 2, 4, 1};
        int[] newArray = new int[array.length];
        int tool = 0;

        for (int arr : array) {
            System.out.println(arr);
        }
        System.out.println();

        //使用数组去重
        //双层for循环，外层当前数，内层标记后一个数
        for (int i = 0; i < array.length; i++) {
            //添加重复标记
            boolean isRep = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isRep = false;
                }
            }

            //不重复添加进新数组
            if (isRep) {
                newArray[tool] = array[i];
                tool++;
            }
        }

        for (int arr : newArray) {
            System.out.println(arr);
        }

    }
}
