package com.prabhat.string2;
import java.util.HashMap;

// 3. First Non-Repeating Character
public class FirstNonRepeatingChar {
    public static char firstNonRepeating(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (countMap.get(c) == 1) return c;
        }
        return '_'; // Return '_' if no non-repeating character
    }
    public static void main(String[] args) {
        String s = "swiss";
        System.out.println("First non-repeating character: " + firstNonRepeating(s));
    }
}
