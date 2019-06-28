package com.algorithms_examples.sorting.selection_sort_algorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{ 2, 35, 11, 78, 99, 3, 56 };
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }

            // swapping
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }
}