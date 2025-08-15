package com.prabhat.concurrency;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Example: Synchronization, Locks, and Thread-Safe Collections in Java
public class SynchronizationDemo {
    // 1. Synchronized block
    private int counter = 0;
    public void increment() {
        synchronized (this) {
            counter++;
        }
    }

    // 2. Using ReentrantLock
    private final Lock lock = new ReentrantLock();
    private int lockCounter = 0;
    public void incrementWithLock() {
        lock.lock();
        try {
            lockCounter++;
        } finally {
            lock.unlock();
        }
    }

    // 3. Thread-safe collection
    public void threadSafeCollectionExample() {
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add("A");
        syncList.add("B");
        System.out.println("Synchronized List: " + syncList);

        ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("one", 1);
        concurrentMap.put("two", 2);
        System.out.println("ConcurrentMap: " + concurrentMap);
    }

    public static void main(String[] args) {
        SynchronizationDemo demo = new SynchronizationDemo();
        // Synchronized block example
        demo.increment();
        System.out.println("Counter (synchronized): " + demo.counter);
        // Lock example
        demo.incrementWithLock();
        System.out.println("Counter (lock): " + demo.lockCounter);
        // Thread-safe collections
        demo.threadSafeCollectionExample();
    }
}
