package com.prabhat.string2;

// 8. Implement strstr() - Find the first occurrence of a substring in a string
public class StrStr {
    /**
     * Returns the index of the first occurrence of needle in haystack, or -1 if not found.
     */
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int n = haystack.length(), m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        System.out.println("Index of first occurrence: " + strStr(haystack, needle));
    }
}
