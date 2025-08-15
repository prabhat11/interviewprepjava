package com.prabhat.recursive;

// 3. Sum of Array using recursion
public class SumArrayRecursive {
    public static int sum(int[] arr, int n) {
        if (n <= 0) return 0;
        return sum(arr, n - 1) + arr[n - 1];
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum of array: " + sum(arr, arr.length));
    }
}
