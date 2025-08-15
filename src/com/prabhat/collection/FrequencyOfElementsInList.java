package com.prabhat.collection;
import java.util.*;

// 3. Find Frequency of Elements in a List
// Explanation: Uses a HashMap to count the frequency of each element in the list.
public class FrequencyOfElementsInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Integer> freqMap = new HashMap<>();
        for (String fruit : list) {
            freqMap.put(fruit, freqMap.getOrDefault(fruit, 0) + 1);
        }
        System.out.println("Frequency of elements: " + freqMap);
    }
}
