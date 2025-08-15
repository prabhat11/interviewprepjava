package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 17. Find duplicate elements in a list using streams
public class FindDuplicatesWithStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6);
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = numbers.stream()
            .filter(n -> !seen.add(n))
            .collect(Collectors.toSet());
        System.out.println("Duplicates: " + duplicates);
    }
}
