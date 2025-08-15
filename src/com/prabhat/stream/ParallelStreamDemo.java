package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 11. Parallelize stream operations and discuss pitfalls
public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) numbers.add(i);
        int sumSequential = numbers.stream().mapToInt(Integer::intValue).sum();
        int sumParallel = numbers.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println("Sequential sum: " + sumSequential);
        System.out.println("Parallel sum: " + sumParallel);
        // Pitfall: Parallel streams may not preserve order and can have thread-safety issues with mutable data.
    }
}
