package com.prabhat.collection;
import java.util.*;

// 5. Find Intersection of Two Sets
// Explanation: Uses retainAll() to find common elements between two sets.
public class IntersectionOfSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
        set1.retainAll(set2);
        System.out.println("Intersection: " + set1);
    }
}
