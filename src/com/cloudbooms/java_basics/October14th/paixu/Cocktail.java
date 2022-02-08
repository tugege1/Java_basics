package com.cloudbooms.java_basics.October14th.paixu;

/**
 * 鸡尾酒排序：又称冒泡排序改进版，搅拌排序，双向冒泡排序
 * 先从左往右排序，那么下一轮就从右往左，循环往复
 * 适用于大多数元素已经有序的情况下,可以减少排序的回合数。
 */
public class Cocktail {
    public static void main(String[] args) {

        //从左到右排序数组
        //int[] array = {11, 22, 33, 55, 66, 77, 88, 99};
        //从右到左排序数组
        int[] array = {11, 22, 33, 55, 66, 77, 99, 88};

        for (Integer arr : array) {
            System.out.println(arr);
        }

        //外层是回合数，一个回合会经历从左到右、从右到左的排序，增加每轮成功的概率，减少回合数
        for (int j = 0; j < array.length; j++) {
            //定义标记
            boolean isReplace = true;
            //先从左往右排序
            for (int i = 0; i < array.length - (j + 1); i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isReplace = false;
                }
            }
            if (isReplace) {
                System.out.println("从左到右排序完成");
                break;
            }

            //更新标记
            isReplace = true;
            //再从右到左排序
            for (int i = array.length - 1; i > j; i--) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isReplace = false;
                }
            }
            if (isReplace) {
                System.out.println("从右到左排序完成");
                break;
            }
        }

        System.out.println("");
        for (Integer arr : array) {
            System.out.println(arr);
        }
    }
}
