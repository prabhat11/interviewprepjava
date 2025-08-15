package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 14. Find the maximum and minimum in a list using streams
public class FindMaxMinWithStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 2, 33, 4, 15);
        int max = numbers.stream().max(Integer::compareTo).orElse(Integer.MIN_VALUE);
        int min = numbers.stream().min(Integer::compareTo).orElse(Integer.MAX_VALUE);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
