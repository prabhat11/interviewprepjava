package com.prabhat.collection;
import java.util.*;

// 15. Convert a List to a Set and Vice Versa
// Explanation: Shows how to convert a List to a Set (removes duplicates) and a Set to a List.
public class ListSetConversion {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> set = new HashSet<>(list); // List to Set
        System.out.println("Set (from list): " + set);
        List<Integer> newList = new ArrayList<>(set); // Set to List
        System.out.println("List (from set): " + newList);
    }
}
