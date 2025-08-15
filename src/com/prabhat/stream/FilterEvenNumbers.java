package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 6. Filter and collect only even numbers from a list
public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evens = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers: " + evens);
    }
}
