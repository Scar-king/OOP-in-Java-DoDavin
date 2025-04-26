package Lab01;

class Car {
    String model;
    String engine_type;
    String color;
    int year;
    double price;

    Car(String model, String engine_type, String color, int year, double price){
        this.model = model;
        this.engine_type = engine_type;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    void display(){
        System.out.println("___________________");
        System.out.println("\nCar Model: " + model);
        System.out.println("Car Engine Type: " + engine_type);
        System.out.println("Color of the Car: " + color);
        System.out.println("Year of the Car: " + year);
        System.out.printf("Price of the Car ($) %.2f\n", price);
        System.out.println("-----------------------------------");
    }
}

class Employee {
    String name;
    String id;
    int age;
    char gender;
    double salary;
    Employee(String name, String id, int age, char gender, double salary){
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    void display(){
        System.out.println("___________________");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Gender: " + gender);
        System.out.printf("Employee Salary is (USD) %.2f\n", salary);
        System.out.println("-----------------------------------");
    }
}

class BankAccount {
    private String password;
    String username;
    String id;
    private double balance;
    String email;
    BankAccount(String username, String id, String email){
        this.username = username;
        this.id = id;
        this.email = email;
    }

    String getPassword(){
        return password;
    }

    void setPassword(String password){
        this.password = password;
    }

    double getBalance(){
        return balance;
    }

    void setBalance(double balance){
        this.balance = balance;
    }

    void display(){
        System.out.println("___________________");
        System.out.println("User Password: " + getPassword());
        System.out.println("Username: " + username);
        System.out.println("User ID: " + id);
        System.out.println("User Email: " + email);
        System.out.printf("User Balance is (USD) %.2f\n", getBalance());
        System.out.println("-----------------------------------");
    }
}

class Video {
    String title;
    double fileSize;
    int resolution;
    int numberOfView;
    int numberOfLike;
    Video(String title, double fileSize, int resolution, int numberOfView, int numberOfLike){
        this.title = title;
        this.fileSize = fileSize;
        this.resolution = resolution;
        this.numberOfView = numberOfView;
        this.numberOfLike = numberOfLike;
    }

    void display(){
        System.out.println("___________________");
        System.out.println("Title: " + title);
        System.out.printf("File Size: %.2f MB\n", fileSize);
        System.out.println("Resolution: " + resolution + "p");
        System.out.println("Views: " + numberOfView);
        System.out.println("Likes: " + numberOfLike);
        System.out.println("-----------------------------------");
    }
}

public class Ex6 {
    public static void main(String[] args) {
        
        Car car1 = new Car("F1 Mercedes W14", "Hybrid V6 Turbo", "Silver", 2023, 15000000);
        Car car2 = new Car("Lamborghini", "V12", "Red", 2022, 500000);

        Employee employee1 = new Employee("Do Davin", "p20230018", 20, 'M', 2000);
        Employee employee2 = new Employee("Virak Rith", "p20230033", 21, 'M', 2000);

        BankAccount user1 = new BankAccount("Do Davin", "000-111-222", "dodavin@gmail.com");
        BankAccount user2 = new BankAccount("Virak Rith", "111-111-111", "rith@gmail.com");

        Video video1 = new Video("Learn Java in 30 Minutes", 250.75, 1080, 19842, 1342);
        Video video2 = new Video("Top 10 Travel Destinations 2025", 320.40, 720, 58420, 4210);

        System.out.println("=== Car Information ===");
        car1.display();
        car2.display();

        System.out.println("\n=== Employee Information ===");
        employee1.display();
        employee2.display();

        System.out.println("\n=== Bank Account Information ===");
        user1.setPassword("11111111!D");
        user1.setBalance(1000);
        user1.display();
        user2.setPassword("22222222!D");
        user2.setBalance(1000);
        user2.display();

        System.out.println("\n=== Video Information ===");
        video1.display();
        video2.display();
    }
}
