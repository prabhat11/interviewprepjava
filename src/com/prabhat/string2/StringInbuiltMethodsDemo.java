package com.prabhat.string2;

// Demonstrates usage of different String inbuilt methods in Java
public class StringInbuiltMethodsDemo {
    public static void main(String[] args) {
        String str = "  Hello, World!  ";
        String str2 = "hello, world!";
        String str3 = "Java";
        String str4 = "Programming";

        // length()
        System.out.println("Length: " + str.length());

        // trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // equals() and equalsIgnoreCase()
        System.out.println("Equals: " + str.equals(str2));
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(str2));

        // startsWith() and endsWith()
        System.out.println("Starts with '  He': " + str.startsWith("  He"));
        System.out.println("Ends with '!  ': " + str.endsWith("!  "));

        // contains()
        System.out.println("Contains 'World': " + str.contains("World"));

        // charAt()
        System.out.println("Char at 2: " + str.charAt(2));

        // substring()
        System.out.println("Substring (2, 7): '" + str.substring(2, 7) + "'");

        // indexOf() and lastIndexOf()
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

        // replace()
        System.out.println("Replace 'l' with 'x': " + str.replace('l', 'x'));

        // split()
        String[] words = str.trim().split(", ");
        System.out.println("Split by ', ': ");
        for (String word : words) {
            System.out.println(word);
        }

        // concat()
        System.out.println("Concat: " + str3.concat(str4));

        // isEmpty()
        System.out.println("Is empty: " + str.isEmpty());

        // valueOf()
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("Value of int: " + numStr);
    }
}
