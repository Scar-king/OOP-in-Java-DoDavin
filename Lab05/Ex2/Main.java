package Lab05.Ex2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

class Color {
    public static final String RESET = "\u001B[0m";
    public static final String ORANGE = "\u001B[38;5;208m";
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> stuArr = new ArrayList<>();
        ArrayList<String> resultMessage = new ArrayList<>();

        int choice;

        do{

            System.out.println("==== Menu ====");
            System.out.println("1. Add new students");
            System.out.println("2. Delete multiple students");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
             
            int count = 1;
            String answer;

            switch (choice) {
                case 1:

                    do {

                        System.out.println("Student #" + count);
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Age: ");
                        int age = scanner.nextInt();
                        stuArr.add(new Student(id, name, age));
                        count++;

                        scanner.nextLine();
                        System.out.print("Do you want to add more (y/n): ");
                        answer = scanner.nextLine();

                    } while(!answer.equalsIgnoreCase("n"));
                    
                    break;

                case 2:

                    int deleteCount = 1;
                    int no = 1;

                    for(int i = 0; i < 54; i++){
                        System.out.print("=");
                    }
                    System.out.println();
                    System.out.printf("| %-8s | %-8s | %-20s | %-5s |\n", "No", "ID", "Name", "Age");
                    for(int i = 0; i < 54; i++){
                        System.out.print("=");
                    }
                    System.out.println();
                    for(Student stu : stuArr){
                        System.out.printf("| %-8d | %s \n", no++, stu) ;
                    }
                    for(int i = 0; i < 54; i++){
                        System.out.print("=");
                    }
                    System.out.println();

                    System.out.println("==== DELETION ====");
                    do {
                        System.out.print("Input student #" + deleteCount + " ID: ");
                        int deleteId = scanner.nextInt();
                        scanner.nextLine(); 

                        boolean found = false;

                        Iterator<Student> iterator = stuArr.iterator();
                        /*while(iterator.hasNext())
                        - Check if there's another student in the list to look at.
                        - if yes, move to the next student
                        - if no, exit the loop
                        */
                        while (iterator.hasNext()) {
                            Student stu = iterator.next();
                            if (stu.id == deleteId) {
                                iterator.remove(); 
                                resultMessage.add("Student with ID " + deleteId + " deleted");
                                found = true;
                                break; 
                            }
                        }

                        if (!found) {
                            resultMessage.add("Student with ID " + deleteId + " not found!");
                        }

                        deleteCount++;
                        System.out.print("Do you want to delete more (y/n)?: ");
                        answer = scanner.nextLine();

                    } while (!answer.equalsIgnoreCase("n"));

                    System.out.println();
                    for(String rm : resultMessage){
                        System.out.println(Color.ORANGE + rm + Color.RESET);
                    }
                    System.out.println();

                    break;

                case 3:
        
                System.out.println("\nThank you for using our program><");
                break;

                default:
                    System.out.println("\nInvalid input, please try again...\n");
                    break;
            }

        }while(choice != 3);

        scanner.close();
    }
}