package com.prabhat.collection;
import java.util.*;

// 7. Check if a Map Contains a Key or Value
// Explanation: Demonstrates containsKey() and containsValue() methods.
public class MapContainsKeyValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("orange", 5);
        System.out.println("Contains key 'apple': " + map.containsKey("apple"));
        System.out.println("Contains value 2: " + map.containsValue(2));
    }
}
