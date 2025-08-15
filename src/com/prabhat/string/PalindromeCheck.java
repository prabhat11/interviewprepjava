package com.prabhat.string;
// Question: How do you check if a string is a palindrome?
// Explanation: This example checks if a string reads the same forwards and backwards.

public class PalindromeCheck {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(str + " is palindrome? " + isPalindrome(str));
    }
}
