package com.cloudbooms.java_basics.October14th.paixu;


/**
 * 冒泡排序是一种简单的排序算法，通过设置方向依次走过需要排序的元素，比较相邻的两个元素
 * 对n个人进行排序，需要n-1次比较；时间复杂度为 O(n^2)
 */
public class Maopao {
    public static void main(String[] args) {

        //创建数组
        int[] array = {11, 88, 99, 77, 33, 55, 22, 66};

        for (Integer arr : array) {
            System.out.println(arr);
        }

        //调用左到右提取方法
        /*array = leftToRight(array);
        System.out.println("");
        for (Integer arr : array) {
            System.out.println(arr);
        }*/

        //调用右到左提取方法
        array = rightToLeft(array);
        System.out.println("");
        for (Integer arr : array) {
            System.out.println(arr);
        }

    }

    /**
     * 正序:从左往右
     */
    public static int[] leftToRight(int[] array) {
        for (int j = 0; j < array.length; j++) {
            //定义标记:冒泡优化
            boolean isReplace = true;
            for (int i = 0; i < array.length - (j + 1); i++) {
                if (array[i] > array[i + 1]) {
                    //定义临时变量
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isReplace = false;
                }
            }
            if (isReplace) {
                break;
            }
        }
        return array;
    }


    /**
     * 正序:从右往左
     */
    public static int[] rightToLeft(int[] array) {
        for (int j = 0; j < array.length; j++) {
            //定义标记
            boolean isReplace = true;
            for (int i = array.length - (j + 1); i > j; i--) {
                if (array[i] < array[i - 1]) {
                    //定义临时变量
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isReplace = false;
                }
            }
            if (isReplace) {
                break;
            }
        }
        return array;
    }


}
