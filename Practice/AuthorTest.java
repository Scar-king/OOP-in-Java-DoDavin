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

    public void setName(String name){
        this.name = name;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "Name: " + name + ", Email: " + email + ", Gender: " + gender;
    }

}

public class AuthorTest {
    public static void main(String[] args) {
        Author author1 = new Author("Do Davin", "dodavin@gmail.com", 'M');
        System.out.println(author1);
        Author author2 = new Author("Kol Thyda", "kolthyda@gmail.com", 'F');
        System.out.println(author2);
    }
}
