package com.algorithms_examples.sorting.quick_sort_algorithm;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{ 3, 6, 1, 56, 45, 88 };
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) {
            return;
        }

        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot+1, end);
    }

    private static int partition(int[] array, int begin, int end) {
        int pivot = end;
        int counter = begin;

        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }

        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }
}