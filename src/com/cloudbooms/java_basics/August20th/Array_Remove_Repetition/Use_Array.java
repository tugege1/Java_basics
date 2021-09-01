package com.cloudbooms.java_basics.August20th.Array_Remove_Repetition;

public class Use_Array {

    public static void main(String[] args) {
        //创建数组
        int[] array = {1, 2, 1, 4, 9, 8, 2, 7};

        //创建临时数组  以及新数组起始位置
        int[] newArray = new int[array.length];
        int t = 0;

        //创建两个循环 判断两个数组
        for (int i = 0; i < array.length; i++) {
            //创建标记 true表示没有重复元素
            boolean isRepeat = true;
            for (int j = i + 1; j < array.length; j++) { //起始为 i+1  用来进行比较
                if (array[i] == array[j]) {
                    isRepeat = false;
                    break;
                }
            }
            if (isRepeat) {
                newArray[t] = array[i];
                t++;
            }
        }
        for (Integer arr : newArray) {
            System.out.println(arr);
        }
    }
}
