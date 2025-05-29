package Lab05.Ex1;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        MyDate myDate = new MyDate();
        int option;

        do {
            System.out.println("==== Menu ===");
            System.out.println("1. Current date and time");
            System.out.println("2. Calculate days btw two dates");
            System.out.println("3. Find the day of the week");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.println("Current datetime is: " + myDate.getCurrentDate());
                    break;

                case 2:
                    try {
                        System.out.print("First date (dd/MM/yyyy): ");
                        String d1 = scanner.nextLine();
                        System.out.print("Second date (dd/MM/yyyy): ");
                        String d2 = scanner.nextLine();
                        long days = myDate.calculateDaysBtwDates(d1, d2);
                        System.out.println("Difference between two dates is: " + days + " days");
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Please use dd/MM/yyyy.");
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Input a date (dd/MM/yyyy): ");
                        String inputDate = scanner.nextLine();
                        String day = myDate.findDay(inputDate);
                        System.out.println("The day is: " + day);
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Please use dd/mm/yyyy.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using our program><");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println();
        } while (option != 4);

        scanner.close();
    }
}