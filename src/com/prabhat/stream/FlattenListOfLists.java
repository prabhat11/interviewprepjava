package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 13. Flatten a list of lists using streams
public class FlattenListOfLists {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2),
            Arrays.asList(3, 4),
            Arrays.asList(5, 6)
        );
        List<Integer> flatList = listOfLists.stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());
        System.out.println("Flattened list: " + flatList);
    }
}
