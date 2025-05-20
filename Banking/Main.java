package Banking;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("p20230018", "Do Davin", 1000);
        Account account2 = new Account("p20231800", "Kol Thyda", 2000);

        System.out.println("Before transfer:");
        System.out.println(account1);
        System.out.println(account2);

        account1.transferTo(account2, 1000);

        System.out.println("After transfer:");
        System.out.println(account1);
        System.out.println(account2);
    }
}
