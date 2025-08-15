package com.prabhat.string;

// Demonstrates how interning strings can save memory by ensuring only one instance of each unique string is kept in the pool
public class StringPoolMemory {
    public static void main(String[] args) {
        String s1 = new String("pool").intern();
        String s2 = "pool";
        String s3 = new String("pool");

        System.out.println("s1 == s2: " + (s1 == s2)); // true, both refer to the pool object
        System.out.println("s2 == s3: " + (s2 == s3)); // false, s3 is a new object on the heap
        System.out.println("s1 == s3.intern(): " + (s1 == s3.intern())); // true, both are interned
    }
}

/*
Explanation:
- Interning a string ensures it refers to the pool object.
- Without interning, new String() creates a new object in heap.
- Using intern() helps save memory by reusing pool objects.
*/
