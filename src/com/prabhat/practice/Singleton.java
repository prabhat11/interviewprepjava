package com.prabhat.practice;
// Question: Implement the Singleton design pattern in Java.
// Explanation: This example shows a thread-safe Singleton implementation using double-checked locking.

public class Singleton {
    private static volatile Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public void show() {
        System.out.println("Singleton instance invoked");
    }
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.show();
    }
}
