package com.prabhat.stream;
import java.util.*;
import java.util.stream.*;

// 12. Handle checked exceptions in stream operations
public class StreamCheckedExceptionDemo {
    public static void main(String[] args) {
        List<String> files = Arrays.asList("file1.txt", "file2.txt");
        files.stream().forEach(file -> {
            try {
                // Simulate checked exception handling (e.g., reading a file)
                if (file.equals("file2.txt")) throw new Exception("File not found");
                System.out.println("Processing: " + file);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        });
    }
}
