package com.prabhat.collection;
import java.util.*;

// 11. Implement LRU Cache Using LinkedHashMap
// Explanation: Demonstrates a simple LRU cache by overriding removeEldestEntry in LinkedHashMap.
class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;
    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}
public class LRUCacheDemo {
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        cache.get(1);
        cache.put(4, "D"); // Evicts key 2
        System.out.println("Cache: " + cache);
    }
}
