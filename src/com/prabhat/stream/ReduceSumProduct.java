package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 9. Use reduce() to calculate the sum/product of a list of numbers
public class ReduceSumProduct {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
