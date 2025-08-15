package com.prabhat.collection;
import java.util.*;

// 6. Find Union of Two Sets
// Explanation: Uses addAll() to combine elements from both sets.
public class UnionOfSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
        set1.addAll(set2);
        System.out.println("Union: " + set1);
    }
}
