package com.prabhat.collection;
import java.util.*;

// Example: Custom Collection - A simple bounded queue
// Demonstrates advanced usage by extending AbstractQueue
public class BoundedQueue<E> extends AbstractQueue<E> {
    private final int capacity;
    private final LinkedList<E> list = new LinkedList<>();

    public BoundedQueue(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be positive");
        this.capacity = capacity;
    }

    @Override
    public boolean offer(E e) {
        if (list.size() >= capacity) return false;
        return list.offer(e);
    }

    @Override
    public E poll() {
        return list.poll();
    }

    @Override
    public E peek() {
        return list.peek();
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    @Override
    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        BoundedQueue<Integer> queue = new BoundedQueue<>(3);
        System.out.println(queue.offer(1)); // true
        System.out.println(queue.offer(2)); // true
        System.out.println(queue.offer(3)); // true
        System.out.println(queue.offer(4)); // false (full)
        System.out.println(queue.poll());   // 1
        System.out.println(queue.offer(4)); // true
        System.out.println(queue);          // [2, 3, 4]
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
