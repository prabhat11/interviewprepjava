package com.prabhat.string;

import java.util.*;

// Question: Group anagrams from a list of strings.
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Grouped Anagrams: " + groupAnagrams(input));
    }
}

/*
Explanation:
- For each string, sort its characters to form a key.
- Group all strings with the same sorted key together in a map.
- Return the grouped anagrams as a list of lists.
*/
