package com.solvd.task1;

import java.util.Arrays;

public class Sort {

    private final static String sortMessage = "Array is sorted";

    public static int[] insertionSort(int[] array) {
        System.out.println("Start array is " + Arrays.toString(array));
        if (array.length > 1) {
            for (int i = 0; i < array.length; ++i) {
                int j = i;
                while (j > 0 && array[j - 1] > array[j]) {
                    int key = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = key;
                    j = j - 1;
                }
            }
            System.out.println(sortMessage + " to " + Arrays.toString(array));
        } else {
            System.out.println(sortMessage + " or can't be sorted");
        }
        return array;
    }
}
