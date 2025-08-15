package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 15. Use Collectors.teeing() to collect two results at once
public class TeeingCollectorDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 2, 33, 4, 15);
        Map<String, Integer> result = numbers.stream().collect(
            Collectors.teeing(
                Collectors.maxBy(Integer::compareTo),
                Collectors.minBy(Integer::compareTo),
                (max, min) -> {
                    Map<String, Integer> map = new HashMap<>();
                    map.put("max", max.orElse(null));
                    map.put("min", min.orElse(null));
                    return map;
                }
            )
        );
        System.out.println("Max: " + result.get("max"));
        System.out.println("Min: " + result.get("min"));
    }
}
