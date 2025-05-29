package Lab05.Ex6;

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
    public static final String ORANGE = "\u001B[38;5;208m";
}

public class Main {

    static final String FILE_NAME = "Files\\user.txt";
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int option;

        do {

            System.out.println("=== Menu ===");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    
                    List<String> users = readLines();
                    System.out.println("\n==== Login ====");
                    System.out.print("Email or Username: ");
                    String input = scanner.nextLine().trim();
                    System.out.print("Password: ");
                    String inputPassword = String.valueOf(System.console().readPassword()).trim();

                    boolean found = false;

                    for(String line : users){
                        String[] parts = line.split(",");
                        if(parts.length >= 5){
                            String first_name = parts[0];
                            String last_name = parts[1];
                            String linesUsername = parts[2];
                            String linesEmail = parts[3];
                            String linesPassword = parts[4];

                            if((input.equals(linesUsername.trim()) || input.equals(linesEmail.trim())) && inputPassword.equals(linesPassword.trim())){
                                System.out.println("\n=========== User Info ===========");
                                System.out.println(Color.ORANGE + "Hi " + first_name + " " + last_name + ",");
                                System.out.println("Your username is: " + linesUsername);
                                System.out.println("Your email is: " + linesEmail + "\n" + Color.RESET);
                                found = true;
                                break;
                            }
                        }
                    }

                    if(!found){
                        System.out.println(Color.RED + "\nUser not found, please try again..." + Color.RESET);
                    }
                    break;

                case 2:

                    List<String> lines = readLines();
                    System.out.println("\n==== Register a new user ====");
                    System.out.print("First Name: ");
                    String first_name = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String last_name = scanner.nextLine();
                    System.out.print("Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Password: ");
                    String password = String.valueOf(System.console().readPassword()).trim();

                    String user = String.format("%s,%s,%s,%s,%s", first_name, last_name, username, email, password);

                    lines.add(user);
                    writeLines(lines);
                    System.out.println(Color.GREEN + "\nYou are successfully registered~" + Color.RESET);
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;
            
                default:
                    System.out.println(Color.RED + "Invalid input, please try again..." + Color.RESET);
                    break;
            }

        } while(option != 3);


        scanner.close();
    }

    static List<String> readLines(){
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while((line = reader.readLine()) != null){
                lines.add(line);
            }
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        return lines;
    }

    static void writeLines(List<String> lines){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for(String line : lines){
                writer.write(line);
                writer.newLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}