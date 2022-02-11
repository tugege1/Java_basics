package com.cloudbooms.basics_test2022.paixu;

/**
 * 希尔排序
 * 又称递减增量排序算法，是插入排序的一种更高效的改进版本是非稳定排序算法
 * 思路：数的个数为length,i=length/2。再i/2逐步缩小增量，最后完成简单快速排序
 *
 * @author Tu
 * @date 2022/2/10 14:02
 */
public class XiEr {

    public static void main(String[] args) {

        int[] array = {8, 5, 4, 2, 9, 7, 6, 3, 1};
        for (int arr : array) {
            System.out.println(arr);
        }
        System.out.println();

        ///序列的间隔，一直到间隔为一，这时候就只有一个子序列
        int grp = 2;
        for (int i = array.length / grp; i > 0; i /= grp) {
            //从i之后每个数字都进行插入排序，但是插入的序列是各自不同的序列
            //注意：从中间分开，这里的j会向后递增，而下个for循环会j-i也向后递增(中间)，所以每个序列两个数字，分成不同的序列
            for (int j = i; j < array.length; j++) {
                //内部是插入算法
                int temp = array[j];
                //定义当前数
                int k;
                //实现各个数字插入排序到不同的序列中
                for (k = j - i; k >= 0; k -= i) {
                    //如果前面的数大于当前数
                    if (temp < array[k]) {
                        array[k + i] = array[k];

                    } else {
                        break;
                    }
                }
                //注意:每次循环完都会执行k-=i，所以此时k+i是给当前数赋值排序后较小的数字
                array[k + i] = temp;
            }
        }

        for (int arr : array) {
            System.out.println(arr);
        }
    }

}
