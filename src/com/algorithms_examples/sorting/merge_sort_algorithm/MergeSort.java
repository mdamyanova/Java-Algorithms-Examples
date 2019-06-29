package com.algorithms_examples.sorting.merge_sort_algorithm;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[] { 24, 5, 67, 2, 7 };
        // passing the left-most and right-most element
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
    private static void mergeSort(int[] array, int left, int right) {
        if (right <= left) {
            return;
        }

        int mid = (left + right) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        int[] leftArray = new int [lengthLeft];
        int[] rightArray = new int [lengthRight];

        for (int i = 0; i < lengthLeft; i++) {
            leftArray[i] = array[left + i];
        }

        for (int i = 0; i < lengthRight; i++) {
            rightArray[i] = array[mid + i + 1];
        }

        int leftIndex = 0;
        int rightIndex = 0;

        // copying from leftArray and rightArray back into array
        for (int i = left; i < right + 1; i++) {
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // if all the elements have been copied from rightArray, copy the rest of leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // if all the elements have been copied from leftArray, copy the rest of rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}