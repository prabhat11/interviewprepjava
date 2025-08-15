package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 2. Find the second highest salary from a list of Employee objects using streams
class Employee {
    String name;
    int salary;
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String toString() { return name + "(" + salary + ")"; }
}
public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("A", 5000),
            new Employee("B", 7000),
            new Employee("C", 6000),
            new Employee("D", 7000)
        );
        Optional<Integer> secondHighest = employees.stream()
            .map(e -> e.salary)
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst();
        System.out.println("Second highest salary: " + secondHighest.orElse(-1));
    }
}
