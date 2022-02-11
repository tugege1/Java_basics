package com.cloudbooms.basics_test2022.paixu;

/**
 * @author Tu
 * @date 2022/2/8 17:38
 */
public class XuanZe {

    public static void main(String[] args) {

        int[] array = {8, 5, 4, 2, 9, 7, 6, 3, 1};
        for (Integer arr : array) {
            System.out.println(arr);
        }
        System.out.println();

        //选择排序总共进行N-1次
        for (int i = 0; i < array.length; i++) {
            //记录未排序第一个元素下标
            int math = i;
            //内存用来找最小值下标，从i+1开始
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[math]) {
                    math = j;
                }
            }
            //判断是否需要排序
            if (math != i) {
                System.out.println("数据替换为:" + array[i] + "=>=>=>" + array[math]);
                int temp = array[i];
                array[i] = array[math];
                array[math] = temp;
            }
        }

        for (Integer arr : array) {
            System.out.println(arr);
        }
    }

}
