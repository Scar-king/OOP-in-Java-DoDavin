package DateTest;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(31, 7, 2025);
        System.out.println("Current date: " + date);

        date.setDate(19, 5, 2025);
        System.out.println("Updated date: " + date);
    }
}
