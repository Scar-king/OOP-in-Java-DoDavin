package Receipt;

public class Main {
    public static void main(String[] args) {
        InvoiceItem invoiceItem = new InvoiceItem("A010", "iPhone", 2, 1499.99);
        System.out.println(invoiceItem);
        System.out.println("Total: " + invoiceItem.getTotal());
    }
}
