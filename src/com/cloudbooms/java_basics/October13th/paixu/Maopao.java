package com.cloudbooms.java_basics.October13th.paixu;

public class Maopao {
    public static void main(String[] args) {

        //创建数组的三种方式
        int[] array = {12, 44, 33, 11, 88, 99, 76};
        //数组不可以改变长度，集合可以
        int[] array2 = new int[6];
        int[] array3 = new int[]{12, 44, 33, 11, 88, 99, 76};

        for (int arr : array){
            System.out.println(arr);
        }

        for (int j = 0; j < array.length; j++) {
            //外层定义一个标记
            boolean isReplace = true;
            //防止下标越界
            for (int i = 0;i<array.length-(j+1);i++){
                //定义临时变量
                int temp = 0;
                if(array[i]>array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isReplace = false;
                }
            }

            if(isReplace){
                break;
            }
        }

        System.out.println();
        for (int arr : array){
            System.out.println(arr);
        }

    }
}
