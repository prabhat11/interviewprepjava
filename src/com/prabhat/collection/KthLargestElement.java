package com.prabhat.collection;
import java.util.*;

// 12. Find the Kth Largest Element in a List
// Explanation: Uses a PriorityQueue (min-heap) to find the kth largest element.
public class KthLargestElement {
    public static int findKthLargest(List<Integer> list, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : list) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 1, 5, 6, 4);
        int k = 2;
        System.out.println(k + "th largest element: " + findKthLargest(list, k));
    }
}
