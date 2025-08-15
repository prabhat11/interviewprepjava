package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 3. Group a list of objects by a field and count the occurrences
class Person {
    String city;
    Person(String city) { this.city = city; }
    public String toString() { return city; }
}
public class GroupByAndCount {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Delhi"), new Person("Mumbai"), new Person("Delhi"), new Person("Chennai"), new Person("Mumbai")
        );
        Map<String, Long> cityCount = people.stream()
            .collect(Collectors.groupingBy(p -> p.city, Collectors.counting()));
        System.out.println("City count: " + cityCount);
    }
}
