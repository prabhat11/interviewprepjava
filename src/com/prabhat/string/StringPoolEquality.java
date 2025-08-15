package com.prabhat.string;

// Demonstrates String Pool concept in Java
public class StringPoolEquality {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        String d = c.intern();

        System.out.println("a == b: " + (a == b)); // true, both refer to the same pool object
        System.out.println("a == c: " + (a == c)); // false, c is a new object
        System.out.println("a == d: " + (a == d)); // true, d is interned to pool
        System.out.println("a.equals(c): " + a.equals(c)); // true, values are equal
    }
}

/*
Explanation:
- String literals are stored in the String Pool, so 'a' and 'b' refer to the same object.
- 'c' is created with 'new', so it's a different object.
- 'd' is interned, so it refers to the pool object.
- '==' checks reference equality, 'equals()' checks value equality.
*/
