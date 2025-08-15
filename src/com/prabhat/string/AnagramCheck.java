package com.prabhat.string; // Declares the package for this class
// Question: How do you check if two strings are anagrams?
// Explanation: This example checks if two strings are anagrams by sorting their characters and comparing.
// Anagrams are words or phrases formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// Example: "listen" and "silent" are anagrams.

import java.util.Arrays; // Imports the Arrays utility class for array operations

public class AnagramCheck { // Declares the public class AnagramCheck
    public static boolean isAnagram(String s1, String s2) { // Method to check if two strings are anagrams
        if (s1.length() != s2.length()) return false; // If lengths differ, they can't be anagrams
        char[] arr1 = s1.toCharArray(); // Convert first string to character array
        char[] arr2 = s2.toCharArray(); // Convert second string to character array
        Arrays.sort(arr1); // Sort the first character array
        Arrays.sort(arr2); // Sort the second character array
        return Arrays.equals(arr1, arr2); // Compare sorted arrays; true if anagrams
    }
    public static void main(String[] args) { // Main method to test the isAnagram function
        String s1 = "listen", s2 = "silent"; // Example strings
        System.out.println(s1 + " and " + s2 + " are anagrams? " + isAnagram(s1, s2)); // Print result
    }
}