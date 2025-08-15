package com.prabhat.realtime;
// Question: How do you handle deadlock in Java?
// Explanation: This example demonstrates using tryLock to avoid deadlock.

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockAvoidance {
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public void safeMethod() {
        boolean gotLock1 = false, gotLock2 = false;
        try {
            gotLock1 = lock1.tryLock();
            gotLock2 = lock2.tryLock();
            if (gotLock1 && gotLock2) {
                // critical section
                System.out.println("Both locks acquired, safe to proceed.");
            } else {
                System.out.println("Could not acquire both locks, avoiding deadlock.");
            }
        } finally {
            if (gotLock1) lock1.unlock();
            if (gotLock2) lock2.unlock();
        }
    }

    public static void main(String[] args) {
        DeadlockAvoidance da = new DeadlockAvoidance();
        da.safeMethod();
    }
}
