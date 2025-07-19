package Ex2;

import java.util.Scanner;

public class Main {
    private final static double MIN_BALANCE = 0.0;
    private final static double MAX_BALANCE = 1000000.0;
    public static void main(String[] args) {
        BankManagement bank = new BankManagement();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {

            System.out.printf(Color.YELLOW + "\n\t+----------------------------------+\n");
            System.out.printf("\t|         ::: The Bank :::         |\n");
            System.out.printf("\t+----------------------------------+\n");
            System.out.printf("\t| %-2d. %-28s |\n", 1, "Account List");
            System.out.printf("\t| %-2d. %-28s |\n", 2, "Create an account");
            System.out.printf("\t| %-2d. %-28s |\n", 3, "Deposit to an account");
            System.out.printf("\t| %-2d. %-28s |\n", 4, "Withdraw from an account");
            System.out.printf("\t| %-2d. %-28s |\n", 5, "Transfer to another account");
            System.out.printf("\t| %-2d. %-28s |\n", 6, "Quit");
            System.out.printf("\t+----------------------------------+\n\n" + Color.RESET);
            
            while(true){
                try {
                    System.out.print(Color.YELLOW + "Choose an option: " + Color.RESET);
                    choice = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println(Color.RED + "\nChoice can't be character or any special character!\n" + Color.RESET);
                    scanner.nextLine();
                }
            }
          
            double amount;
            int fromId;
            int toId;

            switch(choice){
                case 1:
                    bank.showAccounts();
                    break;
                case 2:
                    int id;
                    String name;
                    double balance;

                    while(true){
                        try {  
                            System.out.print(Color.YELLOW + "Enter ID: " + Color.RESET);
                            id = scanner.nextInt();
                            scanner.nextLine();
                            break;
                        } catch (Exception e) {
                            System.out.println(Color.RED + "\nInvalid ID. Please enter a numeric value instead of text!\n" + Color.RESET);
                            scanner.nextLine();
                        }
                    }

                    while(true){
                        System.out.print(Color.YELLOW + "Enter Name: " + Color.RESET);
                        name = scanner.nextLine();
                        if(name.matches("[a-zA-z ]+")) {
                            break;
                        } else {
                            System.out.println(Color.RED + "\nInvalid name. Please use letters only!\n" + Color.RESET);
                        }
                    }

                    while(true){
                        try {
                            System.out.print(Color.YELLOW + "Enter Balance: " + Color.RESET);
                            balance = scanner.nextDouble();
                            scanner.nextLine();
                            if(balance < MIN_BALANCE || balance > MAX_BALANCE || !bank.isValidDecimal(balance)) {
                                   System.out.println(Color.RED + 
                                    "Please enter a valid balance:\n" +
                                    "- It must be a positive number.\n" +
                                    "- It can have at most **two decimal places**.\n" +
                                    "- The maximum allowed balance is **1,000,000**." + 
                                    Color.RESET);
                            } else {
                                break;
                            }
                        } catch (Exception e) {
                            System.out.println(Color.RED + "\nInvalid balance. Please enter a numeric value.\n" + Color.RESET);
                            scanner.nextLine();
                        }
                    }

                    bank.createAccount(id, name, balance);
                    break;
                case 3:
                    while(true){
                        try {
                            System.out.print(Color.YELLOW + "Enter Account ID: " + Color.RESET);
                            id = scanner.nextInt();
                            scanner.nextLine();
                            break;
                        } catch (Exception e) {
                            System.out.println(Color.RED + "\nInvalid ID. Please enter a numeric value instead of text!\n" + Color.RESET);
                            scanner.nextLine();
                        }
                    }

                    while(true){
                        try { 
                            System.out.print(Color.YELLOW + "Enter Amount: " + Color.RESET);
                            amount = scanner.nextDouble();
                            if(amount <= MIN_BALANCE || amount > MAX_BALANCE || !bank.isValidDecimal(amount)) {
                                  System.out.println(Color.RED + 
                                    "Please enter a valid amount:\n" +
                                    "- It must be a positive number.\n" +
                                    "- It can have at most **two decimal places**.\n" +
                                    "- The maximum allowed balance is **1,000,000**." + 
                                    Color.RESET);
                            } else {
                                break;
                            }
                        } catch (Exception e) {
                            System.out.println(Color.RED + "\nInvalid amount. Please enter a numeric value instead of text!\n" + Color.RESET);
                            scanner.nextLine();
                        }
                    }

                    bank.deposit(id, amount);
                    break;
                case 4:
                    while (true) {
                        try {
                            System.out.print(Color.YELLOW + "Enter Account ID: " + Color.RESET);
                            id = scanner.nextInt();
                            scanner.nextLine();
                            break;
                        } catch (Exception e) {
                            System.out.println(Color.RED + "\nInvalid ID. Please enter a numeric value instead of text!\n" + Color.RESET);
                            scanner.nextLine();
                        }   
                    }

                    while(true){
                        try { 
                            System.out.print(Color.YELLOW + "Enter Amount: " + Color.RESET);
                            amount = scanner.nextDouble();
                            if(amount <= MIN_BALANCE || amount > MAX_BALANCE || !bank.isValidDecimal(amount)) {
                                System.out.println(Color.RED + 
                                    "Please enter a valid amount:\n" +
                                    "- It must be a positive number.\n" +
                                    "- It can have at most **two decimal places**.\n" +
                                    "- The maximum allowed balance is **1,000,000**." + 
                                    Color.RESET);
                            } else {
                                break;
                            }
                        } catch (Exception e) {
                            System.out.println(Color.RED + "\nInvalid amount. Please enter a numeric value instead of text!\n" + Color.RESET);
                            scanner.nextLine();
                        }
                    }

                    bank.withdraw(id, amount);
                    break;
                case 5:
                    while (true) {
                        try {     
                            System.out.print(Color.YELLOW + "From Account ID: " + Color.RESET);
                            fromId = scanner.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println(Color.RED + "\nInvalid ID. Please enter a numeric value instead of text!\n" + Color.RESET);
                            scanner.nextLine();
                        }
                    }

                    while (true) {
                        try {         
                            System.out.print(Color.YELLOW + "To Account ID: " + Color.RESET);
                            toId = scanner.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println(Color.RED + "\nInvalid ID. Please enter a numeric value instead of text!\n" + Color.RESET);
                            scanner.nextLine();
                        }
                    }

                    while(true){
                        try { 
                            System.out.print(Color.YELLOW + "Enter Amount: " + Color.RESET);
                            amount = scanner.nextDouble();
                            if(amount <= MIN_BALANCE || amount > MAX_BALANCE || !bank.isValidDecimal(amount)) {
                                    System.out.println(Color.RED + 
                                    "Please enter a valid amount:\n" +
                                    "- It must be a positive number.\n" +
                                    "- It can have at most **two decimal places**.\n" +
                                    "- The maximum allowed balance is **1,000,000**." + 
                                    Color.RESET);
                            } else {
                                break;
                            }
                        } catch (Exception e) {
                            System.out.println(Color.RED + "\nInvalid amount. Please enter a numeric value instead of text!\n" + Color.RESET);
                            scanner.nextLine();
                        }
                    }

                    bank.transfer(fromId, toId, amount);
                    break;
                case 6:
                    System.out.println("\nExiting program...\n");
                    break;
                default:
                    System.out.println(Color.RED + "\nInvalid option, please try again...\n" + Color.RESET);
                    break;
            }

        } while(choice != 6);
        scanner.close();
    }
}