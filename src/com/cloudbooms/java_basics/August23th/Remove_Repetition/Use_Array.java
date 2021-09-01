package com.cloudbooms.java_basics.August23th.Remove_Repetition;

public class Use_Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 4, 9, 8, 2, 7};
        int[] newArray = new int[array.length];
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            //状态判断每次循环都要还原
            boolean isRep = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isRep = false;
                    //有重复的就不需要再判断
                    break;
                }
            }
            if (isRep) {
                newArray[num] = array[i];
                num++;
            }
        }

        for (Integer arr : newArray) {
            System.out.println(arr);
        }

    }
}
