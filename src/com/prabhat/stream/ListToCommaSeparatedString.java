package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 5. Convert a List<String> to a comma-separated String using streams
public class ListToCommaSeparatedString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        String result = words.stream().collect(Collectors.joining(", "));
        System.out.println("Comma-separated: " + result);
    }
}
