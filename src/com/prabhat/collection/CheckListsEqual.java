package com.prabhat.collection;
import java.util.*;

// 14. Check if Two Lists are Equal
// Explanation: Uses equals() to check if two lists have the same elements in the same order.
public class CheckListsEqual {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list3 = Arrays.asList(5, 4, 3, 2, 1);
        System.out.println("list1 equals list2? " + list1.equals(list2)); // true
        System.out.println("list1 equals list3? " + list1.equals(list3)); // false
    }
}
