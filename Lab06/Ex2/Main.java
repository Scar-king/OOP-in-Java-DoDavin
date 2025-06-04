package Lab06.Ex2;

import java.util.Scanner;

class MyMath {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int n : arr)
            total += n;
        return total;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static int multiply(int[] arr) {
        int result = 1;
        for (int n : arr)
            result *= n;
        return result;
    }

    public static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int max(int a, int b, int c, int d) {
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int n : arr)
            if (n > max) max = n;
        return max;
    }

    public static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static int min(int a, int b, int c, int d) {
        return Math.min(a, Math.min(b, Math.min(c, d)));
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int n : arr)
            if (n < min) min = n;
        return min;
    }

    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static double average(int a, int b, int c, int d) {
        return (a + b + c + d) / 4.0;
    }

    public static double average(int[] arr) {
        int sum = 0;
        for (int n : arr)
            sum += n;
        return (double) sum / arr.length;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Menu ====");
            System.out.println("1. Sum of two values");
            System.out.println("2. Sum of three values");
            System.out.println("3. Sum of many values");
            System.out.println("4. Multiply of two values");
            System.out.println("5. Multiply of three values");
            System.out.println("6. Multiply of many values");
            System.out.println("7. Max of three values");
            System.out.println("8. Max of four values");
            System.out.println("9. Max of many values");
            System.out.println("10. Min of three values");
            System.out.println("11. Min of four values");
            System.out.println("12. Min of many values");
            System.out.println("13. Average of three values");
            System.out.println("14. Average of four values");
            System.out.println("15. Average of many values");
            System.out.println("16. Quit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            int a, b, c, d;
            int[] arr;

            switch (choice) {
                case 1:
                    System.out.print("Enter a: ");
                    a = scanner.nextInt();
                    System.out.print("Enter b: ");
                    b = scanner.nextInt();
                    System.out.println("Sum: " + MyMath.sum(a, b));
                    break;
                case 2:
                    System.out.print("Enter a: ");
                    a = scanner.nextInt();
                    System.out.print("Enter b: ");
                    b = scanner.nextInt();
                    System.out.print("Enter c: ");
                    c = scanner.nextInt();
                    System.out.println("Sum: " + MyMath.sum(a, b, c));
                    break;
                case 3:
                    arr = readArray(scanner);
                    System.out.println("Sum: " + MyMath.sum(arr));
                    break;
                case 4:
                    System.out.print("Enter a: ");
                    a = scanner.nextInt();
                    System.out.print("Enter b: ");
                    b = scanner.nextInt();
                    System.out.println("Product: " + MyMath.multiply(a, b));
                    break;
                case 5:
                    System.out.print("Enter a: ");
                    a = scanner.nextInt();
                    System.out.print("Enter b: ");
                    b = scanner.nextInt();
                    System.out.print("Enter c: ");
                    c = scanner.nextInt();
                    System.out.println("Product: " + MyMath.multiply(a, b, c));
                    break;
                case 6:
                    arr = readArray(scanner);
                    System.out.println("Product: " + MyMath.multiply(arr));
                    break;
                case 7:
                    System.out.print("Enter a: ");
                    a = scanner.nextInt();
                    System.out.print("Enter b: ");
                    b = scanner.nextInt();
                    System.out.print("Enter c: ");
                    c = scanner.nextInt();
                    System.out.println("Max: " + MyMath.max(a, b, c));
                    break;
                case 8:
                    System.out.print("Enter a: ");
                    a = scanner.nextInt();
                    System.out.print("Enter b: ");
                    b = scanner.nextInt();
                    System.out.print("Enter c: ");
                    c = scanner.nextInt();
                    System.out.print("Enter d: ");
                    d = scanner.nextInt();
                    System.out.println("Max: " + MyMath.max(a, b, c, d));
                    break;
                case 9:
                    arr = readArray(scanner);
                    System.out.println("Max: " + MyMath.max(arr));
                    break;
                case 10:
                    System.out.print("Enter a: ");
                    a = scanner.nextInt();
                    System.out.print("Enter b: ");
                    b = scanner.nextInt();
                    System.out.print("Enter c: ");
                    c = scanner.nextInt();
                    System.out.println("Min: " + MyMath.min(a, b, c));
                    break;
                case 11:
                    System.out.print("Enter a: ");
                    a = scanner.nextInt();
                    System.out.print("Enter b: ");
                    b = scanner.nextInt();
                    System.out.print("Enter c: ");
                    c = scanner.nextInt();
                    System.out.print("Enter d: ");
                    d = scanner.nextInt();
                    System.out.println("Min: " + MyMath.min(a, b, c, d));
                    break;
                case 12:
                    arr = readArray(scanner);
                    System.out.println("Min: " + MyMath.min(arr));
                    break;
                case 13:
                    System.out.print("Enter a: ");
                    a = scanner.nextInt();
                    System.out.print("Enter b: ");
                    b = scanner.nextInt();
                    System.out.print("Enter c: ");
                    c = scanner.nextInt();
                    System.out.println("Average: " + MyMath.average(a, b, c));
                    break;
                case 14:
                    System.out.print("Enter a: ");
                    a = scanner.nextInt();
                    System.out.print("Enter b: ");
                    b = scanner.nextInt();
                    System.out.print("Enter c: ");
                    c = scanner.nextInt();
                    System.out.print("Enter d: ");
                    d = scanner.nextInt();
                    System.out.println("Average: " + MyMath.average(a, b, c, d));
                    break;
                case 15:
                    arr = readArray(scanner);
                    System.out.println("Average: " + MyMath.average(arr));
                    break;
                case 16:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 16);
    }

    private static int[] readArray(Scanner scanner) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values:");
        for (int i = 0; i < n; i++){
            System.out.print("Enter index #" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}