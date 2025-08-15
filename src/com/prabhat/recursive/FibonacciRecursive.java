package com.prabhat.recursive;

// 2. Fibonacci using recursion
public class FibonacciRecursive {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}
