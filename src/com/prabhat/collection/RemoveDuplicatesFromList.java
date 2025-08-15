package com.prabhat.collection;
import java.util.*;

// 2. Remove Duplicates from a List
// Explanation: Removes duplicates by converting the list to a LinkedHashSet (preserves order).
public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 7, 5);
        Set<Integer> set = new LinkedHashSet<>(list);
        List<Integer> uniqueList = new ArrayList<>(set);
        System.out.println("List after removing duplicates: " + uniqueList);
    }
}
