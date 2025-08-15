package com.prabhat.hackerrank;
// Question: Find the length of the longest substring without repeating characters.
// Explanation: This is a classic sliding window problem often asked in interviews.

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0, left = 0, right = 0;
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right++));
                maxLen = Math.max(maxLen, set.size());
            } else {
                set.remove(s.charAt(left++));
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Longest unique substring length: " + lengthOfLongestSubstring(s));
    }
}
