package com.prabhat.concurrency;

import java.util.concurrent.*;
import java.util.*;

// Example: Concurrency and Multithreading in Java
// Demonstrates Executors, Fork/Join, and CompletableFuture
public class ConcurrencyDemo {
    // 1. Using Executors
    public static void executorExample() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable task = () -> System.out.println("Executor Task: " + Thread.currentThread().getName());
        executor.submit(task);
        executor.submit(task);
        executor.shutdown();
    }

    // 2. Using Fork/Join Framework
    static class SumTask extends RecursiveTask<Integer> {
        private final int[] arr;
        private final int start, end;
        public SumTask(int[] arr, int start, int end) {
            this.arr = arr;
            this.start = start;
            this.end = end;
        }
        @Override
        protected Integer compute() {
            if (end - start <= 2) {
                int sum = 0;
                for (int i = start; i < end; i++) sum += arr[i];
                return sum;
            } else {
                int mid = (start + end) / 2;
                SumTask left = new SumTask(arr, start, mid);
                SumTask right = new SumTask(arr, mid, end);
                left.fork();
                int rightResult = right.compute();
                int leftResult = left.join();
                return leftResult + rightResult;
            }
        }
    }

    // 3. Using CompletableFuture
    public static void completableFutureExample() {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(500); } catch (InterruptedException ignored) {}
            return 42;
        });
        future.thenAccept(result -> System.out.println("CompletableFuture result: " + result));
        future.join();
    }

    public static void main(String[] args) {
        System.out.println("--- Executor Example ---");
        executorExample();

        System.out.println("--- Fork/Join Example ---");
        int[] arr = {1, 2, 3, 4, 5, 6};
        ForkJoinPool pool = new ForkJoinPool();
        int sum = pool.invoke(new SumTask(arr, 0, arr.length));
        System.out.println("Fork/Join sum: " + sum);

        System.out.println("--- CompletableFuture Example ---");
        completableFutureExample();
    }
}
//more examples of CompletableFuture
// CompletableFuture can be used for more complex asynchronous programming patterns.
// For example, you can combine multiple futures, handle exceptions, and apply transformations.
// Here are some additional examples of using CompletableFuture in Java:
// 1. Combining multiple futures
// CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
//     try { Thread.sleep(100); } catch (InterruptedException ignored) {}
//     return 10;
// });
// CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
//     try { Thread.sleep(200); } catch (InterruptedException ignored) {}
//     return 20;
// });
// CompletableFuture<Integer> combinedFuture = future1.thenCombine(future2, Integer::sum);
// combinedFuture.thenAccept(result -> System.out.println("Combined result: " + result));
// 2. Handling exceptions	
	
	
	
	
	
	// CompletableFuture<Integer> futureWithError = CompletableFuture.supplyAsync(() -> {
	//     // Simulating a task that may throw an exception
	//     try { Thread.sleep(100); } catch (InterruptedException ignored) {}
	//     // Uncomment the next line to simulate an error
	//     // This line will throw an exception, which we will handle in the exceptionally block
	//     // Uncomment the next line to simulate an error
	//     // Uncomment the next line to simulate an error



	
	
	//     if (true) throw new RuntimeException("Error occurred");
	//     return 42;
	
	// });
// futureWithError.exceptionally(ex -> {
//     System.out.println("Exception: " + ex.getMessage());
//     return -1; // Default value in case of error
// }).thenAccept(result -> System.out.println("Result: " + result));
// 3. Applying transformations
// CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello")
//     .thenApply(result -> result + " World")
//     .thenApply(String::toUpperCase);
// future.thenAccept(result -> System.out.println("Transformed result: " + result));
// 4. Chaining multiple asynchronous tasks
// CompletableFuture<Void> chainedFuture = CompletableFuture.supplyAsync(() -> {
//     return "Task 1";
// }).thenApply(result -> {
//     return result + " -> Task 2";
// }).thenAccept(result -> {
//     System.out.println("Chained result: " + result);
// });
// chainedFuture.join(); // Wait for completion
// These examples demonstrate the flexibility of CompletableFuture for handling asynchronous tasks in Java.
// You can use it to create complex workflows, handle errors gracefully, and manage dependencies between tasks.
// CompletableFuture is a powerful tool for asynchronous programming in Java, allowing you to write non-blocking code that can handle multiple tasks concurrently.
// You can use it to create complex workflows, handle errors gracefully, and manage dependencies between tasks.
// CompletableFuture is a powerful tool for asynchronous programming in Java, allowing you to write non-blocking code that can handle multiple tasks concurrently.
// You can use it to create complex workflows, handle errors gracefully, and manage dependencies between tasks.
// You can use it to create complex workflows, handle errors gracefully, and manage dependencies between tasks.
// CompletableFuture is a powerful tool for asynchronous programming in Java, allowing you to write non-blocking code that can handle multiple tasks concurrently.
// You can use it to create complex workflows, handle errors gracefully, and manage dependencies between tasks.
// You can use it to create complex workflows, handle errors gracefully, and manage dependencies between tasks.
// CompletableFuture is a powerful tool for asynchronous programming in Java, allowing you to write non-blocking code that can handle multiple tasks concurrently.

