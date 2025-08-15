package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 4. Remove duplicates from a list using streams
public class RemoveDuplicatesWithStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> unique = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique elements: " + unique);
    }
}
