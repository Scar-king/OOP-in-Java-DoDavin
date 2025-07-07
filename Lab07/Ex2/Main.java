package Ex2;

import java.util.*;

abstract class NumberRandomizer {
    abstract int randomInBetween(int min, int max);
    abstract int[] randomizeUniqueInBetween(int min, int max, int amount);
}

class MyRandomizer extends NumberRandomizer {
    Random rand = new Random();

    @Override
    int randomInBetween(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }

    @Override
    int[] randomizeUniqueInBetween(int min, int max, int amount) {
        if (amount > (max - min + 1)) {
            throw new IllegalArgumentException("Amount exceeds the number of unique values in the range.");
        }

        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }

        Collections.shuffle(list);
        int[] result = new int[amount];
        for (int i = 0; i < amount; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyRandomizer randomizer = new MyRandomizer();

        while (true) {
            System.out.println("==== Number Randomizer ===");
            System.out.println("1. In between");
            System.out.println("2. Unique in between");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter min: ");
                int min = scanner.nextInt();
                System.out.print("Enter max: ");
                int max = scanner.nextInt();
                int result = randomizer.randomInBetween(min, max);
                System.out.println("Random number: " + result);
            } else if (choice == 2) {
                System.out.print("Enter min: ");
                int min = scanner.nextInt();
                System.out.print("Enter max: ");
                int max = scanner.nextInt();
                System.out.print("Enter amount of unique numbers: ");
                int amount = scanner.nextInt();
                try {
                    int[] result = randomizer.randomizeUniqueInBetween(min, max, amount);
                    System.out.println("Random unique numbers: " + Arrays.toString(result));
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
