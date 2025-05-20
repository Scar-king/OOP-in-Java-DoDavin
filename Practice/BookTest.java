package Practice;

class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public char getGender(){
        return gender;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Email: " + email + ", Gender: " + gender;
    }

}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    @Override
    public String toString(){
        return "Book[Name: " + name + ", Author[" + author + "], price: " + price + ", qty: " + qty + "]";
    }

}

public class BookTest {
    public static void main(String[] args) {
        Author author = new Author("Do Davin", "dodavin@gmail.com", 'M');
        Book book = new Book("Java Programming Language", author, 11.99, 1);

        System.out.println(book);
    }   
}
