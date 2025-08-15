package com.prabhat.collection;
import java.util.*;

// 4. Sort a List of Custom Objects
// Explanation: Sorts a list of Employee objects by age using Comparator.
class Employee {
    String name;
    int age;
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + "(" + age + ")";
    }
}
public class SortCustomObjects {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 30),
            new Employee("Bob", 25),
            new Employee("Charlie", 35)
        );
        employees.sort(Comparator.comparingInt(e -> e.age));
        System.out.println("Sorted by age: " + employees);
    }
}
