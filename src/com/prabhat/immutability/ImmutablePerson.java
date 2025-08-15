package com.prabhat.immutability;

// Example of Immutability in Java
// Effective Java Practice: Always make fields final and private, avoid setters, and return copies of mutable objects.
public final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // No setters, no way to modify fields after construction
    // Class is final, so cannot be subclassed
    // All fields are private and final

    public static void main(String[] args) {
        ImmutablePerson p = new ImmutablePerson("Alice", 30);
        System.out.println("Name: " + p.getName() + ", Age: " + p.getAge());
    }
}
