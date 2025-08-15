package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 1. Difference between map() and flatMap()
public class MapVsFlatMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world");
        // map(): List<Stream<String>>
        List<Stream<String>> mapped = words.stream().map(w -> Arrays.stream(w.split(""))).collect(Collectors.toList());
        // flatMap(): Stream<String>
        List<String> flatMapped = words.stream().flatMap(w -> Arrays.stream(w.split(""))).collect(Collectors.toList());
        System.out.println("map() result size: " + mapped.size());
        System.out.println("flatMap() result: " + flatMapped);
    }
}
