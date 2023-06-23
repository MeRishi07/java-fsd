package Assisted_Practice_Projects2;

import java.io.*;

public class Practice_Project07 {
    public static void main(String[] args) {
        // Create a new file
        createFile("sample.txt");

        // Read the contents of a file
        readFile("sample.txt");

        // Update the contents of a file
        updateFile("sample.txt", "This is the updated content.");

        // Read the updated contents of the file
        readFile("sample.txt");

        // Delete the file
        deleteFile("sample.txt");
    }

    public static void createFile(String fileName) {
        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    public static void readFile(String fileName) {
        File file = new File(fileName);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("Reading file: " + file.getName());
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    public static void updateFile(String fileName, String content) {
        File file = new File(fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
            System.out.println("File updated: " + file.getName());
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file.");
            e.printStackTrace();
        }
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted: " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
