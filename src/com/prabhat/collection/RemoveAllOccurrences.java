package com.prabhat.collection;
import java.util.*;

// 17. Remove All Occurrences of a Given Element from a List
// Explanation: Uses removeAll() to remove all instances of a specific element from a list.
public class RemoveAllOccurrences {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"));
        list.removeAll(Collections.singleton("apple"));
        System.out.println("List after removing 'apple': " + list);
    }
}
