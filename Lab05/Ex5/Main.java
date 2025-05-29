package Lab05.Ex5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Color {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
}

public class Main {
    static final String TEACHER_FILE = "Files\\teacher.txt";
    static final String STUDENT_FILE = "Files\\student.txt";
    static final String SECURITYGUARD_FILE = "Files\\securityguard.txt";

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do{

            System.out.println("=== Menu ===");
            System.out.println("1. View all");
            System.out.println("2. Add new");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
    
            switch (choice) {
    
                case 1:
                    viewFile();
                    break;
    
                case 2:

                    while(true){
                        System.out.println("==== Add new resource ====");
                        System.out.println("1. Teacher");
                        System.out.println("2. Student");
                        System.out.println("3. Security guard");
                        System.out.print("Choose an option: ");
                        int option = scanner.nextInt();
                        scanner.nextLine();
        
                        if (option == 1) {
                            addTeacher(scanner);
                            break;
                        } else if (option == 2) {
                            addStudent(scanner);
                            break;
                        } else if (option == 3){
                            addSecurityguard(scanner);
                            break;
                        } else {
                            System.out.println(Color.RED + "Invalid option, please try again..." + Color.RESET);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using our program><");
                    break;
                    
                default:
                    System.out.println(Color.RED + "Invalid choice, please try again..." + Color.RESET);
                    break;
                }
            } while(choice != 3);
        scanner.close();
    }

    static void addTeacher(Scanner scanner) {
        List<String> lines = readLines(TEACHER_FILE);
        System.out.print("First Name: ");

        String first_name = scanner.nextLine();
        System.out.print("Last Name: ");
        String last_name = scanner.nextLine();
        System.out.print("SEX: ");
        String sex = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Subject: ");
        String subject = scanner.nextLine();
        System.out.print("Salary: ");
        String salary = Double.toString(scanner.nextDouble());

        String teacher = String.format("%d. [%s %s][%s][%s][%s][%s$]", (lines.size() + 1), first_name, last_name, sex.toUpperCase(),
                email, subject, salary);
        lines.add(teacher);
        writeLines(TEACHER_FILE, lines);
    }

    static void addStudent(Scanner scanner){

        List<String> lines = readLines(STUDENT_FILE);

        System.out.print("First Name: ");
        String first_name = scanner.nextLine();
        System.out.print("Last Name: ");
        String last_name = scanner.nextLine();
        System.out.print("SEX: ");
        String sex = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Year: ");
        String year = Integer.toString(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Major: ");
        String major = scanner.nextLine();

        String student = String.format("%d. [%s %s][%s][%s][%s][%s]", (lines.size() + 1), first_name, last_name, sex.toUpperCase(),
                email, year, major);

        lines.add(student);
        writeLines(STUDENT_FILE, lines);

    }

    static void addSecurityguard(Scanner scanner){

        List<String> lines = readLines(SECURITYGUARD_FILE);

        System.out.print("First Name: ");
        String first_name = scanner.nextLine();
        System.out.print("Last Name: ");
        String last_name = scanner.nextLine();
        System.out.print("SEX: ");
        String sex = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Position: ");
        String position = scanner.nextLine();

        String securityguard = String.format("%d. [%s %s][%s][%s][%s]", (lines.size() + 1), first_name, last_name, sex.toUpperCase(), email, position);

        lines.add(securityguard);
        writeLines(SECURITYGUARD_FILE, lines);

    }

    static void viewFile() {

        List<String> linesFromTeacher = readLines(TEACHER_FILE);
        System.out.println("\n==== Teacher ====");
        for (int i = 0; i < linesFromTeacher.size(); i++) {
            System.out.println(Color.GREEN + linesFromTeacher.get(i) + Color.RESET);
        }

        List<String> linesFromStu = readLines(STUDENT_FILE);
        System.out.println("\n==== Student ====");
        for(int i = 0; i < linesFromStu.size(); i++){
            System.out.println(Color.GREEN + linesFromStu.get(i) + Color.RESET);
        }

        List<String> linesFromSG = readLines(SECURITYGUARD_FILE);
        System.out.println("\n==== Security guard ====");
        for(int i = 0; i < linesFromSG.size(); i++){
            System.out.println(Color.GREEN + linesFromSG.get(i) + Color.RESET);
        }
    }

    static List<String> readLines(String filename) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lines;
    }

    static void writeLines(String filename, List<String> lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}