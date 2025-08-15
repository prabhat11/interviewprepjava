package com.prabhat.jvm;

// Example: Java Memory Model, Garbage Collection Tuning, and JVM Internals
public class MemoryModelAndGC {
    // Demonstrates object allocation, reference, and eligibility for garbage collection
    static class Dummy {
        private final int id;
        private byte[] memory = new byte[1024 * 1024]; // 1MB to make GC visible
        public Dummy(int id) { this.id = id; }
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Dummy object with id " + id + " is being garbage collected");
        }
    }

    // Demonstrates memory visibility with volatile
    static volatile boolean flag = false;
    static int sharedCounter = 0;

    public static void main(String[] args) throws InterruptedException {
        // 1. Demonstrate GC with large objects
        for (int i = 0; i < 10; i++) {
            Dummy d = new Dummy(i);
        }
        System.gc();
        Thread.sleep(200);
        System.out.println("Requested GC after allocating large objects.");

        // 2. Demonstrate memory visibility (Java Memory Model)
        Thread writer = new Thread(() -> {
            sharedCounter = 42;
            flag = true;
        });
        Thread reader = new Thread(() -> {
            while (!flag) {
                // busy wait
            }
            System.out.println("Reader sees sharedCounter: " + sharedCounter);
        });
        writer.start();
        reader.start();
        writer.join();
        reader.join();

        // 3. Print JVM internals (heap size, free memory, etc.)
        Runtime rt = Runtime.getRuntime();
        System.out.println("JVM max memory: " + rt.maxMemory() / (1024 * 1024) + " MB");
        System.out.println("JVM total memory: " + rt.totalMemory() / (1024 * 1024) + " MB");
        System.out.println("JVM free memory: " + rt.freeMemory() / (1024 * 1024) + " MB");

        // 4. (Optional) GC tuning: Run with JVM options like -Xmx32m -Xms16m -XX:+PrintGCDetails
        System.out.println("Run with JVM options like -Xmx32m -Xms16m -XX:+PrintGCDetails for GC tuning info.");
    }
}