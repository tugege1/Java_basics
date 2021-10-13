package com.cloudbooms.java_basics.October13th.paixu;

public class Maopao2 {
    public static void main(String[] args) {

        int[] array = {22, 55, 44, 33, 79, 88, 46, 19};

        for (int arr : array) {
            System.out.println(arr);
        }

        for (int j = 0; j < array.length; j++) {
            //外层循环定义标记
            boolean isReplace = true;
            for (int i = 0; i < array.length - (j + 1); i++) {
                if (array[i] > array[i + 1]) {
                    //定义临时变量
                    int temp = 0;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isReplace = false;
                }
            }

            if (isReplace) {
                break;
            }
        }

        System.out.println();
        for (int arr : array) {
            System.out.println(arr);
        }

    }
}
