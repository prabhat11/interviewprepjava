package com.prabhat.collection;
import java.util.*;

// 1. Find Duplicates in an ArrayList
// Explanation: Finds and prints duplicate elements in a list using a HashSet.
public class FindDuplicatesInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 7, 5);
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Integer num : list) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicates: " + duplicates);
    }
}
