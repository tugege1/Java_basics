package com.cloudbooms.java_basics.August23th.maopao;

public class maopao {
    public static void main(String[] args) {

        int[] array = {1, 5, 9, 8, 7, 2, 3};
        boolean isReplace = true;

        for (Integer arr : array) {
            System.out.println(arr);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - (i + 1); j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isReplace = false;
                }
            }
            if (isReplace) {
                break;
            }
        }

        System.out.println("");
        for (Integer arr : array) {
            System.out.println(arr);
        }

    }
}
