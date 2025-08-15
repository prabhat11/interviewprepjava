package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 20. Limit and skip elements in a stream
public class LimitAndSkipDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
        List<Integer> limited = numbers.stream().limit(3).collect(Collectors.toList());
        List<Integer> skipped = numbers.stream().skip(3).collect(Collectors.toList());
        System.out.println("First 3 elements: " + limited);
        System.out.println("After skipping 3 elements: " + skipped);
    }
}
