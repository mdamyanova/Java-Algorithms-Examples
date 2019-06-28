package com.algorithms_examples.recursion;

public class FactorialCalc {
    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }
    private static long Factorial(int num) {
        // base case
        if (num == 0) {
            return 1;
        }

        return num * Factorial(num - 1);
    }
}