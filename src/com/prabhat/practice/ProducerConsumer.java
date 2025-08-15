package com.prabhat.practice;
// Question: Implement the Producer-Consumer problem using wait() and notify().
// Explanation: This example demonstrates inter-thread communication using wait() and notify() for the classic Producer-Consumer problem.

public class ProducerConsumer {
    private static final int CAPACITY = 5;
    private final java.util.Queue<Integer> queue = new java.util.LinkedList<>();
    private final Object lock = new Object();

    class Producer extends Thread {
        public void run() {
            int value = 0;
            while (true) {
                synchronized (lock) {
                    while (queue.size() == CAPACITY) {
                        try { lock.wait(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
                    }
                    queue.add(value);
                    System.out.println("Produced " + value);
                    value++;
                    lock.notifyAll();
                }
            }
        }
    }

    class Consumer extends Thread {
        public void run() {
            while (true) {
                synchronized (lock) {
                    while (queue.isEmpty()) {
                        try { lock.wait(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
                    }
                    int val = queue.poll();
                    System.out.println("Consumed " + val);
                    lock.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        Producer p = pc.new Producer();
        Consumer c = pc.new Consumer();
        p.start();
        c.start();
    }
}
