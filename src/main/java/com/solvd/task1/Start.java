package com.solvd.task1;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        System.out.println("User data output:");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        System.out.println("Run Insertion Sort output for array:");
        int[] array = {43, 25, 54, 66, 100, 3, 9, 13};
        System.out.println(Arrays.toString(array));
        System.out.println("Calling the sorting function");
        Sort.insertionSort(array);
        System.out.println("Finish program.");
    }
}
