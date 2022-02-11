package com.cloudbooms.basics_test2022.paixu;

/**
 * 快速排序
 * 冒泡排序的升华版，基于一种二分的思想。快速排序使用分治策略把一个序列分成两个子序列。
 * 1:从数组中挑出一个元素，称为基准
 * 2:把小于基准值的元素放在基准前，大于基准打元素放在基准后
 * <p>
 * 快速排序之所比较快，因为相比冒泡排序，每次交换是跳跃式的。不必像冒泡只能和相邻的元素比较，但仍有这种可能，
 * 因此快速排序的时间复杂度为：平均O(Nlogn),最差:O(N²)退化为冒泡排序。
 * 空间复杂度；最优是O(logn),最差为O(N)退化为冒泡排序
 *
 * @author Tu
 * @date 2022/2/9 9:44
 */
public class KuaiSu {

    public static void main(String[] args) {
        int[] array = {8, 5, 4, 2, 9, 7, 6, 3, 1};
        for (int arr : array) {
            System.out.println(arr);
        }
        System.out.println();

        //初始调用方法
        quickSort(array, 0, array.length - 1);

        for (int arr : array) {
            System.out.println(arr);
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        int start = low;
        int end = high;
        //temp:基准位
        int jizhun = array[low];

        //左边是否小于右边，如果不小于代表已重合
        while (start < end) {
            //必须先看右边，是否大于基准，往左递减
            while (array[end] >= jizhun && end > start) {
                end--;
            }
            if (start < end) {
                int temp = array[end];
                array[end] = array[start];
                array[start] = temp;
            }
            //再看左边，是否小于基准，向右递增
            while (array[start] <= jizhun && end > start) {
                start++;
            }
            if (start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
            //使用递归调用左半数组及右半数组
            if (start > low) {
                quickSort(array, low, start - 1);
            }
            if (end < high) {
                quickSort(array, end + 1, high);
            }
        }
    }

}
