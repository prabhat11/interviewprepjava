package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 16. Convert a Map<K, V> to a List<K> or List<V> using streams
public class MapToListWithStream {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("orange", 5);
        List<String> keys = map.keySet().stream().collect(Collectors.toList());
        List<Integer> values = map.values().stream().collect(Collectors.toList());
        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);
    }
}
