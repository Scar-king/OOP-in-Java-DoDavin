package Ex3;

import java.util.*;

abstract class TextRandomizer {
    abstract char randomizeACharacter();
    abstract String randomizeAString(int length);
    abstract String[] randomizeStrings(int length, int amount);
}

class MyTextRandomizer extends TextRandomizer {
    Random rand = new Random();
    String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    char randomizeACharacter() {
        return alphabet.charAt(rand.nextInt(alphabet.length()));
    }

    @Override
    String randomizeAString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(randomizeACharacter());
        }
        return sb.toString();
    }

    @Override
    String[] randomizeStrings(int length, int amount) {
        Set<String> uniqueStrings = new HashSet<>();
        while (uniqueStrings.size() < amount) {
            uniqueStrings.add(randomizeAString(length));
        }
        return uniqueStrings.toArray(new String[0]);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyTextRandomizer tr = new MyTextRandomizer();

        while (true) {
            System.out.println("==== Text Randomizer ===");
            System.out.println("1. A Character");
            System.out.println("2. A String");
            System.out.println("3. Unique Strings");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            if (option == 1) {
                char c = tr.randomizeACharacter();
                System.out.println("Random Character: " + c);
            } else if (option == 2) {
                System.out.print("Enter string length: ");
                int len = scanner.nextInt();
                String s = tr.randomizeAString(len);
                System.out.println("Random String: " + s);
            } else if (option == 3) {
                System.out.print("Enter string length: ");
                int len = scanner.nextInt();
                System.out.print("Enter amount of strings: ");
                int amt = scanner.nextInt();
                String[] arr = tr.randomizeStrings(len, amt);
                System.out.println("Random Unique Strings:");
                for (String str : arr) {
                    System.out.println(str);
                }
            } else if (option == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option.");
            }
            System.out.println();
        }

        scanner.close();
    }
}

