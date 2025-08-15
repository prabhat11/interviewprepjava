package com.prabhat.builder;

// Example of Builder Pattern in Java (Effective Java Practice)
// The Builder Pattern is used to construct complex objects step by step.
// It allows for more readable and maintainable code, especially when an object has many parameters or optional fields.
// This example demonstrates how to use the Builder Pattern to create a Person object with various attributes.
// The Builder Pattern is particularly useful when an object has many parameters or optional fields.
// It allows for more readable and maintainable code, as it avoids long constructor signatures and makes it clear which parameters are being set.
// The Builder Pattern is a creational design pattern that provides a flexible solution to constructing complex objects.
// The Builder Pattern is often used in conjunction with immutability, where the object being built is immutable.
// The Builder Pattern is a creational design pattern that provides a flexible solution to constructing complex objects.

public class Person {
    private final String name;
    private final int age;
    private final String address;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder {
        private String name;
        private int age;
        private String address;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
        public Person build() {
            return new Person(this);
        }
    }

    public String toString() {
        return name + ", " + age + ", " + address;
    }

    public static void main(String[] args) {
        Person p = new Person.Builder()
            .setName("Bob")
            .setAge(40)
            .setAddress("123 Main St")
            .build();
        System.out.println(p);
    }
}
