package com.prabhat.practice;

// Question: Write Java code to count how many words are in a sentence.
// Explanation: This program defines a method that takes a sentence as input and returns the number of words in it. Words are separated by whitespace.

public class CountWordsInSentence {
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        // Split the sentence by one or more whitespace characters
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    // Method 1: Using split with regex (already implemented)
    public static int countWordsUsingSplit(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    // Method 2: Using StringTokenizer
    public static int countWordsUsingTokenizer(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(sentence);
        return tokenizer.countTokens();
    }

    // Method 3: Using Pattern and Matcher
    public static int countWordsUsingPattern(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\\b\\w+\\b");
        java.util.regex.Matcher matcher = pattern.matcher(sentence);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    // Method 4: Using Java Streams
    public static int countWordsUsingStreams(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        return (int) java.util.Arrays.stream(sentence.trim().split("\\s+")).filter(s -> !s.isEmpty()).count();
    }

    public static void main(String[] args) {
        String sentence = "This is a sample sentence.";
        int wordCount = countWords(sentence);
        System.out.println("Number of words: " + wordCount);

        System.out.println("Using split: " + countWordsUsingSplit(sentence));
        System.out.println("Using StringTokenizer: " + countWordsUsingTokenizer(sentence));
        System.out.println("Using Pattern/Matcher: " + countWordsUsingPattern(sentence));
        System.out.println("Using Streams: " + countWordsUsingStreams(sentence));
    }
}