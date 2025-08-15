package com.prabhat.staticfactory;

// Example: Static Factory Method (Effective Java Practice)
public class Color {
    private final String name;
    private Color(String name) {
        this.name = name;
    }
    public static Color of(String name) {
        return new Color(name);
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        Color red = Color.of("Red");
        System.out.println("Color: " + red.getName());
    }
}
