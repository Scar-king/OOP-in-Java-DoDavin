package Lab05.Ex4;

import java.io.*;
import java.util.*;

public class Main {
    static final String FILE_NAME = "Files\\data.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("==== Menu ====");
            System.out.println("1. View my note");
            System.out.println("2. Edit");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    viewNote();
                    break;
                case 2:
                    editMenu(scanner);
                    break;
                case 3:
                    System.out.println("Thank you for using our program><");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void viewNote() {
        List<String> lines = readLines();
        System.out.println("==== View note ====");
        System.out.println("*****************************");
        for (int i = 0; i < lines.size(); i++) {
            System.out.printf("%d | %s\n", (i + 1), lines.get(i));
        }
        System.out.println("*****************************");
    }

    static void editMenu(Scanner scanner) {
        List<String> lines = readLines();

        System.out.println("==== Edit following note ====");
        System.out.println("*****************************");
        for (int i = 0; i < lines.size(); i++) {
            System.out.printf("%d | %s\n", (i + 1), lines.get(i));
        }
        System.out.println("*****************************");
        System.out.println("1. Append new line");
        System.out.println("2. Update at line");
        System.out.println("3. Delete line");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                System.out.printf("Input a string for line #%d:\n", (lines.size() + 1));
                String newLine = scanner.nextLine();
                lines.add(newLine);
                System.out.printf("Line #%d is appended to the note.\n", lines.size());
                break;
            case 2:
                System.out.print("Enter line number to update: ");
                int updateIndex = scanner.nextInt() - 1;
                scanner.nextLine();
                if (updateIndex >= 0 && updateIndex < lines.size()) {
                    System.out.print("Enter new text: ");
                    String updatedText = scanner.nextLine();
                    lines.set(updateIndex, updatedText);
                    System.out.printf("Line #%d updated.\n", updateIndex + 1);
                } else {
                    System.out.println("Invalid line number.");
                }
                break;
            case 3:
                System.out.print("Delete line number: ");
                int deleteIndex = scanner.nextInt() - 1;
                scanner.nextLine();
                if (deleteIndex >= 0 && deleteIndex < lines.size()) {
                    lines.remove(deleteIndex);
                    System.out.printf("Line #%d is deleted.\n", deleteIndex + 1);
                } else {
                    System.out.println("Invalid line number.");
                }
                break;
            default:
                System.out.println("Invalid option.");
        }

        writeLines(lines);
    }

    static List<String> readLines() {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("File not exited!");
        }
        return lines;
    }

    static void writeLines(List<String> lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
