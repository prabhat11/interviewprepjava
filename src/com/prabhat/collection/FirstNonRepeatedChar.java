package com.prabhat.collection;
import java.util.*;

// 9. Find the First Non-Repeated Character in a String Using Map
// Explanation: Uses LinkedHashMap to preserve order and find the first non-repeated character.
public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String s = "swiss";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated character: " + entry.getKey());
                return;
            }
        }
        System.out.println("No non-repeated character found.");
    }
}
