package com.algorithms_examples.searching.binary_search_algorithm;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {66, 12, 14, 11, 1, 2, 3, 4};

        System.out.println("Enter number for search: ");
        Scanner scanner = new Scanner(System.in);

        int item = scanner.nextInt();
        int location = binarySearch(array, 0, array.length - 1, item);

        if (location != -1) {
            System.out.println("The location of the number is: " + location);
        } else {
            System.out.println("Number not found.");
        }
    }

    private static int binarySearch(int[] array, int start, int end, int item) {
        int mid;

        if (end >= start) {
            mid = (start + end) / 2;

            if (array[mid] == item) {
                return mid + 1;
            } else if (array[mid] < item) {
                return binarySearch(array, mid + 1, end, item);
            } else {
                return binarySearch(array, start, mid - 1, item);
            }
        }

        return -1;
    }
}