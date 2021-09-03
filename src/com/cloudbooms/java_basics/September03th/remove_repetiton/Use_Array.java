package com.cloudbooms.java_basics.September03th.remove_repetiton;

public class Use_Array {
    public static void main(String[] args) {

        int[] array = {1, 5, 2, 4, 2, 9, 7, 5};
        int[] newArray = new int[array.length];
        int tool = 0;

        for (Integer arr : array) {
            System.out.println(arr);
        }
        System.out.println("");

        //外层循环标记前一个数  内存标记后一个数
        for (int i = 0; i < array.length; i++) {
            //状态判断每次循环都要还原
            boolean isRep = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isRep = false;
                    break;
                }
            }
            //根据标记看是否重复，不重复添加到新数组
            if (isRep) {
                newArray[tool] = array[i];
                tool++;
            }
        }

        //有0是因为去重后的数据少了，但长度是和原数组一样
        for (Integer newArr : newArray) {
            System.out.println(newArr);
        }

    }
}
