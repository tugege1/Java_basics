package com.cloudbooms.java_basics.August20th.maopao;

public class maopao {

    public static void main(String[] args) {
        /**
         * 定义数组 三种方式
         *
         */
        int[] array = {77, 99, 11, 66, 33};
        //int[] array = {1, 2, 3, 5, 4};
        //int[] array2 = new int[5];
        //int array3[] = new int[]{1,2,3,4,5};

        /**
         * 排序之前遍历
         */
        for (int arr : array) {
            System.out.println(arr);
        }

        /**
         * 冒泡从小到大排序
         */
        for (int i = 0; i < array.length; i++) { //控制排序的轮数
            //System.out.println("外层第" + (i + 1) + "次运行");

            int flag = 1;//设置一个标志位 表示是否进行了排序
            //1：长度限制（i + 1）是因为下面数据要j和j+1比较 不然会下标越界！
            //2：长度限制array.length减去i + 1是因为符合的数据会跑到最后面，所以减少次数(不减也可以，每次都比较五次)
            for (int j = 0; j < array.length - (i + 1); j++) { //0 1 2 3   长度限制 4 3 2 1
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = 0;
                }
               /* System.out.format("第 %d 遍的第%d 次交换：", i + 1, j + 1);
                for (int count : array) {
                    System.out.print(count);
                }
                System.out.println("");*/

            }
            //System.out.println("#########################");
            /**
             * 在外层循环判断，如果没有交换过元素，表示已经排序完毕
             */
            if (flag == 1) {
                break;
            }
        }

        /**
         * 排序之后遍历
         */
        System.out.println("");
        for (int arr : array) {
            System.out.println(arr);
        }

    }
}
