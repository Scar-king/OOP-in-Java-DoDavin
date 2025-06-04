package Lab06.Ex1;

import java.util.Scanner;

class AbstractMath {
    int reverseNumber(int num){
        return 0;
    }

    int roundedNumber(double num){
        return 0;
    }

    int countDistinct(int[] values){
        return 0;
    }

    int decimalToBinary(int decimal){
        return 0;
    }
}

class Math extends AbstractMath {

    @Override
    int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    @Override
    int roundedNumber(double num) {
        int num_without_decimal = (int) num;
        double decimal = num - num_without_decimal;
        if (decimal >= 0.5)
            return num_without_decimal + 1;
        else
            return num_without_decimal;
    }

    @Override
    int countDistinct(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (values[i] == values[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                count++;
            }
        }
        return count;
    }

    @Override
    int decimalToBinary(int decimal) {
        int binary = 0, base = 1;
        while (decimal > 0) {
            int rem = decimal % 2;
            binary = binary + rem * base;
            base = base * 10;
            decimal = decimal / 2;
        }
        return binary;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Math math = new Math();
        int choice;

        do {
            System.out.println("==== Menu ===");
            System.out.println("1. Reverse a number");
            System.out.println("2. Rounded number");
            System.out.println("3. Count distinct number");
            System.out.println("4. Decimal to Binary");
            System.out.println("5. Quit");
            System.out.print("Choose an opt: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("::: Reverse a number :::");
                    System.out.print("Input number: ");
                    int num = scanner.nextInt();
                    System.out.println("Output is: " + math.reverseNumber(num));
                    break;
                case 2:
                    System.out.println("::: Rounded number :::");
                    System.out.print("Input number: ");
                    double dnum = scanner.nextDouble();
                    System.out.println("Rounded is: " + math.roundedNumber(dnum));
                    break;
                case 3:
                    System.out.println("::: Count distinct numbers :::");
                    System.out.print("Enter total numbers: ");
                    int n = scanner.nextInt();
                    int[] values = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter number " + (i + 1) + ": ");
                        values[i] = scanner.nextInt();
                    }
                    System.out.println("Distinct count is: " + math.countDistinct(values));
                    break;
                case 4:
                    System.out.println("::: Decimal to Binary :::");
                    System.out.print("Input decimal number: ");
                    int decimal = scanner.nextInt();
                    System.out.println("Binary is: " + math.decimalToBinary(decimal));
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again...");
            }

            System.out.println();

        } while (choice != 5);

        scanner.close();
    }
}