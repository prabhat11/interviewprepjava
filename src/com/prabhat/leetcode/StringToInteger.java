package com.prabhat.leetcode;
// Question: Implement the atoi function to convert a string to an integer.
// Explanation: This example parses a string and handles optional sign, overflow, and invalid input.

public class StringToInteger {
    public static int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;
        int i = 0, n = s.length(), sign = 1, result = 0;
        // Skip whitespaces
        while (i < n && s.charAt(i) == ' ') i++;
        // Handle sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i++) == '-') ? -1 : 1;
        }
        // Convert digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i++) - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
        }
        return result * sign;
    }
    public static void main(String[] args) {
        String s = "   -42";
        System.out.println("String to integer: " + myAtoi(s));
    }
}
