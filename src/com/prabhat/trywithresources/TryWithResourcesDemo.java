package com.prabhat.trywithresources;
import java.io.*;

// Example: Try-with-resources (Effective Java Practice)
public class TryWithResourcesDemo {
    public static void main(String[] args) {
        String filePath = "test.txt";
        // Writing to a file using try-with-resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello, try-with-resources!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Reading from a file using try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            System.out.println("Read: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
