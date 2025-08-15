package com.prabhat.collection;
import java.util.*;

// 10. Sort a Map by Values
// Explanation: Sorts a map by its values using a list of entries and a comparator.
public class SortMapByValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("orange", 5);
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue());
        System.out.println("Map sorted by values:");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
