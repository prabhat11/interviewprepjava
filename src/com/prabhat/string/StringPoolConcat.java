package com.prabhat.string;

// Demonstrates String Pool and Concatenation in Java
public class StringPoolConcat {
    public static void main(String[] args) {
        String s1 = "java" + "pool"; // compile-time concatenation
        String s2 = "javapool";        // string literal
        String s3 = "java";
        String s4 = s3 + "pool";       // run-time concatenation

        System.out.println("s1 == s2: " + (s1 == s2)); // true, both are compile-time constants
        System.out.println("s2 == s4: " + (s2 == s4)); // false, s4 is created at runtime
        System.out.println("s2 == s4.intern(): " + (s2 == s4.intern())); // true
    }
}

/*
Explanation:
- Compile-time concatenation ("java" + "pool") results in a string literal in the pool.
- Run-time concatenation (s3 + "pool") creates a new String object on the heap.
- Interning the result of run-time concatenation points it to the pool object.
*/
