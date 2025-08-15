package com.prabhat.realtime;
// Question: How do you use Java Streams to group and count elements?
// Explanation: This example demonstrates grouping a list of objects by a property and counting them using streams.

import java.util.*;
import java.util.stream.*;

class Person {
    private String name;
    public Person(String name) { this.name = name; }
    public String getName() { return name; }
}

public class GroupAndCount {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice"), new Person("Bob"), new Person("Alice"), new Person("Bob"), new Person("Charlie")
        );
        Map<String, Long> countByName = people.stream()
            .collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
        System.out.println(countByName); // Output: {Alice=2, Bob=2, Charlie=1}
    }
}
