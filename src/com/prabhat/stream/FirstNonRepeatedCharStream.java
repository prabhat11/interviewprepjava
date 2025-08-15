package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 8. Find the first non-repeated character in a string using streams
public class FirstNonRepeatedCharStream {
    public static void main(String[] args) {
        String input = "swiss";
        Optional<Character> firstNonRepeated = input.chars()
            .mapToObj(c -> (char) c)
            .filter(c -> input.chars().filter(ch -> ch == c).count() == 1)
            .findFirst();
        System.out.println("First non-repeated character: " + firstNonRepeated.orElse('_'));
    }
}
