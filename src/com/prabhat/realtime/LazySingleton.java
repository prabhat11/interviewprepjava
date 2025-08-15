package com.prabhat.realtime;
// Question: How do you implement thread-safe lazy initialization in Java?
// Explanation: This example demonstrates the double-checked locking pattern for a thread-safe singleton.

public class LazySingleton {
    private static volatile LazySingleton instance;
    private LazySingleton() {}
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
