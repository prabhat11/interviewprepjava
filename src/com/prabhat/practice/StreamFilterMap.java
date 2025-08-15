package com.prabhat.practice;
// Question: Use Java Streams to filter even numbers and square them from a list.
// Explanation: This example demonstrates filtering and mapping using Java 8 Streams.

import java.util.*;
import java.util.stream.*;

public class StreamFilterMap {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println(result); // Output: [4, 16, 36]

        // forEach: print each number
        System.out.print("forEach: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // filter: keep even numbers
        List<Integer> evens = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("filter: " + evens);

        // map: square each number
        List<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println("map: " + squares);

        // flatMap: flatten a list of lists
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        List<Integer> flat = listOfLists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println("flatMap: " + flat);

        // distinct: remove duplicates
        List<Integer> withDuplicates = Arrays.asList(1, 2, 2, 3, 3, 3);
        List<Integer> distinct = withDuplicates.stream().distinct().collect(Collectors.toList());
        System.out.println("distinct: " + distinct);

        // sorted: sort numbers
        List<Integer> sorted = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("sorted (desc): " + sorted);

        // limit: get first 3 numbers
        List<Integer> limited = numbers.stream().limit(3).collect(Collectors.toList());
        System.out.println("limit: " + limited);

        // skip: skip first 2 numbers
        List<Integer> skipped = numbers.stream().skip(2).collect(Collectors.toList());
        System.out.println("skip: " + skipped);

        // anyMatch: check if any number is even
        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("anyMatch (even): " + anyEven);

        // allMatch: check if all numbers are positive
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        System.out.println("allMatch (positive): " + allPositive);

        // noneMatch: check if no number is negative
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("noneMatch (negative): " + noneNegative);

        // count: count numbers
        long count = numbers.stream().count();
        System.out.println("count: " + count);

        // reduce: sum all numbers
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("reduce (sum): " + sum);

        // findFirst: get first number
        Optional<Integer> first = numbers.stream().findFirst();
        System.out.println("findFirst: " + first.orElse(null));

        // findAny: get any number (parallel stream)
        Optional<Integer> any = numbers.parallelStream().findAny();
        System.out.println("findAny: " + any.orElse(null));
    }
}