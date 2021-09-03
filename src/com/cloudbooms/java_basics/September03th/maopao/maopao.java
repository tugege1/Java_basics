package com.cloudbooms.java_basics.September03th.maopao;

public class maopao {
    public static void main(String[] args) {

        int[] array = {1, 5, 6, 7, 2, 4, 9};
        boolean isReplace = true;

        for (Integer arr : array) {
            System.out.println(arr);
        }
        System.out.println("");


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

        for (Integer newArray : array) {
            System.out.println(newArray);
        }

    }
}
