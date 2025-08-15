package com.prabhat.collection;
import java.util.*;

// 8. Iterate Over a Map
// Explanation: Shows how to iterate over keys, values, and entries of a map.
public class IterateOverMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("orange", 5);
        System.out.println("Iterate over keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("Iterate over values:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }
        System.out.println("Iterate over entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
