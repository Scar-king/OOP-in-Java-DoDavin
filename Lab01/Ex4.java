package Lab01;

public class Ex4 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.printf("%35s\n", "A");
        System.out.println("------------------------------------------------------------------");

        System.out.print("|    |");
        for (int num : numbers) {
            System.out.printf(" %4d|", num);
        }
        System.out.println("\n------------------------------------------------------------------");

        for (int i = 1; i <= 5; i++) {
            System.out.printf("| %2d |", i);
            for (int j = 0; j < numbers.length; j++) {
                int value = i * numbers[j];
                System.out.printf(" %4d|", value);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------");

        System.out.printf("%30s\n", "B");
        System.out.println("----------------------------------------------------------");
        System.out.printf("| %-15s | %-10s | %-17s | %-4s|\n", "Country", "Name", "Profession", "Age");
        System.out.println("----------------------------------------------------------");

        String[][] data = {
            {"Germany", "Michael", "Computer Engineer", "19"},
            {"England", "Robert", "Artist", "34"},
            {"United Kingdom", "Julia", "Designer", "42"},
            {"United State", "Jo", "Actor", "21"}
        };

        for (String[] i : data) {
            System.out.printf("| %-15s | %-10s | %-17s | %-4s|\n", i[0], i[1], i[2], i[3]);
            System.out.println("----------------------------------------------------------");
        }
    }
}
