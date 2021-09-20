package com.cloudbooms.java_basics.September16th.maopao;

public class maopao {
    public static void main(String[] args) {

        //创建数组的三种方式
        int[] array = {1, 5, 4, 7, 8, 6, 3};
        int[] array2 = new int[2];
        int[] array3 = new int[]{1, 2};

        //定义标记
        boolean isReplace = true;

        for (Integer arr : array) {
            System.out.println(arr);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - (i + 1); j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    //在外层的循环中判断是否已经成功
                    isReplace = false;
                }
            }

            //退出循环  没有排序就不更改false，代表已经排序完成。退出
            if (isReplace) {
                break;
            }

        }

        System.out.println("");
        for (Integer arr : array) {
            System.out.println(arr);
        }

    }
}
