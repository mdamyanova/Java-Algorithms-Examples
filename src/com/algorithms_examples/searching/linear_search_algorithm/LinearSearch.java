package com.algorithms_examples.searching.linear_search_algorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = new int[] { 4, 1, 2, 11, 45, 32 };
        int key = 11;
        System.out.printf("Key %d is found at index %d",
                key, linearSearch(array, key));
    }

    private static int linearSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }

        return -1;
    }
}