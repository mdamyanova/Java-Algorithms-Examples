package com.algorithms_examples.sorting.bubble_sort_algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{ 99, 69, 11, 15, 3, 4 };
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;

        while(!sorted) {
            sorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}