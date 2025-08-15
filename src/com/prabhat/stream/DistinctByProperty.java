package com.prabhat.stream;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

// 18. Perform a distinct operation based on a property of an object
class Book {
    String title;
    String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String toString() { return title + " by " + author; }
}
public class DistinctByProperty {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Java", "Alice"),
            new Book("Python", "Bob"),
            new Book("Java", "Charlie"),
            new Book("C++", "Alice")
        );
        List<Book> distinctByTitle = books.stream()
            .filter(distinctByKey(b -> b.title))
            .collect(Collectors.toList());
        System.out.println("Distinct by title: " + distinctByTitle);
    }
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }
}
