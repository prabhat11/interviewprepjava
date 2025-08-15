package com.prabhat.realtime;
// Question: How do you reverse a linked list in Java?
// Explanation: This example demonstrates reversing a singly linked list using iteration.

class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class ReverseLinkedList {
    public Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        ReverseLinkedList rll = new ReverseLinkedList();
        Node reversed = rll.reverse(head);
        while (reversed != null) {
            System.out.print(reversed.data + " ");
            reversed = reversed.next;
        }
    }
}
