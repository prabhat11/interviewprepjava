package com.prabhat.composition;

// Example: Favor composition over inheritance (Effective Java Practice)
// This example demonstrates how to use composition to create a Car class that has an Engine.
// Instead of inheriting from an Engine class, we compose a Car with an Engine.
// This allows for more flexibility and better encapsulation.
// In this example, the Car class has an Engine instance, and it uses that instance to start the engine.
// This is a better design than inheriting from an Engine class, as it allows for more modularity and easier testing.
// The Car class can be extended or modified without affecting the Engine class.
// This is a simple example of how to use composition in Java.
// This code is a simple demonstration of composition in Java.
// It is not meant to be a complete or production-ready implementation.
// It is meant to illustrate the concept of composition over inheritance.
// This code is for educational purposes only.
//what is association, aggregation and composition in java
// Association is a relationship between two classes where one class uses the other class.
// Aggregation is a special form of association where one class contains a reference to another class, but the contained class can exist independently.
// Composition is a stronger form of aggregation where the contained class cannot exist independently of the containing class.

class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

public class Car {
    private final Engine engine;
    public Car() {
        this.engine = new Engine();
    }
    public void start() {
        engine.start();
        System.out.println("Car is running");
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}

//Example of Association
class Driver {
	private String name;
	public Driver(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}	
// Example of Aggregation
class Garage {
	private String location;
	private Car car; // Aggregation: Garage has a Car, but Car can exist independently
	public Garage(String location, Car car) {
		this.location = location;
		this.car = car;
	}
	public String getLocation() {
		return location;
	}
	public Car getCar() {
		return car;
	}
}
//what is the difference between association, aggregation and composition in java
// Association is a general term for a relationship between two classes.
// Aggregation is a specific type of association where one class contains a reference to another class, but the contained class can exist independently.
// Composition is a stronger form of aggregation where the contained class cannot exist independently of the containing class.
// In summary:
// - Association: General relationship between classes
// - Aggregation: One class contains a reference to another class, but the contained class can exist independently
// - Composition: One class contains a reference to another class, and the contained class cannot exist independently
// In this example, the Car class is composed of an Engine, and the Garage class aggregates a Car.
// The Driver class is associated with the Car class, as a Driver can drive a Car, but the Car does not depend on the Driver for its existence.
// This code is a simple demonstration of composition, aggregation, and association in Java.
// It is not meant to be a complete or production-ready implementation.
// It is meant to illustrate the concepts of composition, aggregation, and association in Java.

//Driver class has not been used any where in the code, but it can be used to create a Driver object and associate it with a Car object.
// For example, you can create a Driver object and associate it with a Car object like this:
// Driver driver = new Driver("John");
// Car car = new Car();
// System.out.println(driver.getName() + " is driving the car.");
