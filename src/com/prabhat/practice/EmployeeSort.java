package com.prabhat.practice;
// Question: Write a custom Comparator to sort a list of Employee objects by salary in descending order.
// Explanation: This example demonstrates how to use a custom Comparator with Collections.sort().

import java.util.*;

class Employee implements Comparable<Employee> {
    String name;
    int salary;
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String toString() {
        return name + ": " + salary;
    }
    // Natural sorting: by name ascending
    @Override
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 70000),
            new Employee("Bob", 90000),
            new Employee("Charlie", 80000)
        );
        // Natural sorting (by name)
        Collections.sort(employees); // uses Comparable (compareTo)
        System.out.println("Natural sorting (by name, using compareTo): " + employees);
        // Custom sorting (by salary descending)
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e2.salary, e1.salary);
            }
        });
        System.out.println("Custom sorting (by salary desc, using Comparator): " + employees);
    }
}