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
        System.out.println("Car Information: ");
        System.out.println("___________________");
        System.out.println("\nCar Model: " + model);
        System.out.println("Car Engine Type: " + engine_type);
        System.out.println("Color of the Car: " + color);
        System.out.println("Year of the Car: " + year);
        System.out.printf("Price of the Car ($) %.2f\n", price);
        System.out.println("-----------------------------------");
    }
}

public class Ex6 {
    public static void main(String[] args) {
        
        Car car1 = new Car("F1 Mercedes W14", "Hybrid V6 Turbo", "Silver", 2023, 15000000);
        Car car2 = new Car("Lamborghini", "V12", "Red", 2022, 500000);

        car1.display();
        car2.display();
    }
}
