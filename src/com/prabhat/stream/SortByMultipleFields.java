package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 7. Sort a list of custom objects by multiple fields using streams
class Student {
    String name;
    int age;
    double grade;
    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public String toString() { return name + "(" + age + ", " + grade + ")"; }
}
public class SortByMultipleFields {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 22, 88.5),
            new Student("Bob", 20, 88.5),
            new Student("Charlie", 22, 90.0)
        );
        List<Student> sorted = students.stream()
            .sorted(Comparator.comparingDouble((Student s) -> s.grade).reversed()
                .thenComparingInt(s -> s.age))
            .collect(Collectors.toList());
        System.out.println("Sorted by grade desc, then age asc: " + sorted);
    }
}
