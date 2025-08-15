package com.prabhat.string2;

// 2. Check for Palindrome
public class PalindromeCheckDS {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(s + " is palindrome? " + isPalindrome(s));
    }
}
