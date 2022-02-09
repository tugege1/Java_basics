package com.cloudbooms.basics_test2022.paixu;

/**
 * 鸡尾酒排序
 * 双方的元素比较和交换，减少排序的次数，缺点是代码量大，时间复杂度也是O(n²)
 *
 * @author Tu
 * @date 2022/2/8 18:07
 */
public class MaoPaoPlus {
    public static void main(String[] args) {

        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array = {8, 5, 4, 2, 9, 7, 6, 3, 1};

        for (int arr : array) {
            System.out.println(arr);
        }
        System.out.println();

        //外层是回合数，一个回合会经历从左到右、从右到左的排序，增加每轮成功的概率，减少回合数
        for (int i = 0; i < array.length; i++) {
            //定义标记
            boolean isReplace = true;

            //先从左往右排序
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isReplace = false;
                }
            }
            if (isReplace) {
                System.out.println("从左往右排序完成");
                break;
            }

            //更新标记
            isReplace = true;

            //再从右往左排序
            for (int j = array.length - 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    isReplace = false;
                }
            }
            if (isReplace) {
                System.out.println("从右往左排序完成");
                break;
            }
        }

        for (int arr : array) {
            System.out.println(arr);
        }

    }
}
