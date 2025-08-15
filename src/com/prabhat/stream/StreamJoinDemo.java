package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 19. Use streams to join two lists (like SQL join)
class Order {
    int orderId;
    int customerId;
    Order(int orderId, int customerId) {
        this.orderId = orderId;
        this.customerId = customerId;
    }
}
class Customer {
    int customerId;
    String name;
    Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }
}
public class StreamJoinDemo {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order(1, 101),
            new Order(2, 102),
            new Order(3, 101)
        );
        List<Customer> customers = Arrays.asList(
            new Customer(101, "Alice"),
            new Customer(102, "Bob")
        );
        List<String> joined = orders.stream()
            .flatMap(order -> customers.stream()
                .filter(c -> c.customerId == order.customerId)
                .map(c -> "Order " + order.orderId + " by " + c.name))
            .collect(Collectors.toList());
        System.out.println("Joined result: " + joined);
    }
}
