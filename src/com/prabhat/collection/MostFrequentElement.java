package com.prabhat.collection;
import java.util.*;

// 16. Find the Most Frequent Element in a List
// Explanation: Uses a HashMap to count frequencies and finds the element with the highest count.
public class MostFrequentElement {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Integer> freqMap = new HashMap<>();
        for (String s : list) {
            freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
        }
        String mostFrequent = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        System.out.println("Most frequent element: " + mostFrequent + " (" + maxCount + " times)");
    }
}
