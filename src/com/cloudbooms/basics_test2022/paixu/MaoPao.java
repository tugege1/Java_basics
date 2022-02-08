package com.cloudbooms.basics_test2022.paixu;

/**
 * @author Tu
 * @date 2022/2/8 16:53
 */
public class MaoPao {
    public static void main(String[] args) {

        int[] array = {8, 5, 4, 2, 9, 7, 6, 3, 1};

        for (int arr : array) {
            System.out.println(arr);
        }
        System.out.println();

        //判断是否排序完成
        boolean isReplace = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - (i + 1); j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isReplace = false;
                }
            }
            if (isReplace) {
                break;
            }
        }

        for (int arr : array) {
            System.out.println(arr);
        }

    }
}
