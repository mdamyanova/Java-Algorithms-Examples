package com.algorithms_examples.sorting.insertion_sort_algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{ 5, 21, 22, 0, 1, 84, 54 };
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            while(j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = current;
        }
    }
}