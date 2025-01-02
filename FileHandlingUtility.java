// FileHandlingUtility.java
// A utility script demonstrating basic file operations in Java.

import java.io.*;
import java.util.Scanner;

public class FileHandlingUtility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "example.txt";

        try {
            // 1. Write to a file
            System.out.println("Writing to the file...");
            writeToFile(fileName, "Hello, World this is filehandling utility\nWelcome to File Handling in Java.");
            System.out.println("Data written successfully.\n");

            // 2. Read from a file
            System.out.println("Reading from the file...");
            String content = readFromFile(fileName);
            System.out.println("File Content:\n" + content);

            // 3. Append to a file
            System.out.println("Appending to the file...");
            appendToFile(fileName, "\nThis is an appended line.");
            System.out.println("Data appended successfully.\n");

            // 4. Display updated content
            System.out.println("Updated file content:");
            System.out.println(readFromFile(fileName));

            // 5. Delete the file (optional, for demonstration purposes)
            System.out.println("Do you want to delete the file? (yes/no)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                deleteFile(fileName);
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("File retained.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to write data to a file
    public static void writeToFile(String fileName, String data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
        }
    }

    // Method to read data from a file
    public static String readFromFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim();
    }

    // Method to append data to a file
    public static void appendToFile(String fileName, String data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(data);
        }
    }

    // Method to delete a file
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            if (!file.delete()) {
                System.err.println("Failed to delete the file.");
            }
        } else {
            System.err.println("File not found.");
        }
    }
}
