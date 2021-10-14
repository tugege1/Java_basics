package com.cloudbooms.java_basics.October14th.paixu;

/**
 * 选择排序是一种简单的排序算法，从未排序的序列中找出最小(大)元素与最前面(未排序)的元素交换位置
 * 无论什么数据，它的时间复杂度都是 O(n²) ，所以使用这个，数据规模越小越好
 * 与冒泡区别：冒泡是依次交换相邻两个顺序不合法的元素位置，从而将当前最小（大）元素放到合适的位置---元素位置变换多；
 * 排序是每次遍历都记住最大(小)的元素位置，最后只需替换一次即可
 */
public class Choose {
    public static void main(String[] args) {

        //创建数组
        int[] array = {11, 88, 99, 77, 33, 55, 22, 66};

        for (Integer arr : array) {
            System.out.println(arr);
        }

        /*array = little(array);
        System.out.println("");
        for (Integer arr : array) {
            System.out.println(arr);
        }*/

        array = max(array);
        System.out.println("");
        for (Integer arr : array) {
            System.out.println(arr);
        }


    }

    /**
     * 从小到大排序
     *
     * @param array
     * @return
     */
    public static int[] little(int[] array) {
        // 总共要经过 N-1 轮比较
        for (int j = 0; j < array.length - 1; j++) {
            //记录未排序的第一个元素位置(保存最小值的位置)
            int min = j;
            //和后面的值比较(j+1)，内层只用来找最小值
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min]) {
                    // 记录目前能找到的最小值元素的下标
                    min = i;
                }
            }
            //进行元素替换(如果第一位不是最小值)
            if (min != j) {
                System.out.println("数据替换为:" + array[j] + "---" + array[min]);
                int temp = array[min];
                array[min] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }


    /**
     * 从大到小排序
     *
     * @param array
     * @return
     */
    public static int[] max(int[] array) {
        // 总共要经过 N-1 轮比较
        for (int j = 0; j < array.length - 1; j++) {
            //记录未排序的第一个元素位置(保存最大值的位置)
            int max = j;
            //和后面的值比较(j+1)，内层只用来找最大值
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] > array[max]) {
                    // 记录目前能找到的最大值元素的下标
                    max = i;
                }
            }
            //进行元素替换(如果第一位不是最小值)
            if (max != j) {
                System.out.println("数据替换为:" + array[j] + "---" + array[max]);
                int temp = array[max];
                array[max] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }


}
