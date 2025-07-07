package Ex1;

import java.util.Scanner;

abstract class ShapeArea {
    abstract double calculateRectangleArea(double width, double height);
    abstract double calculateCircleArea(double radius);
    abstract double calculateTriangleAreaBySides(double a, double b, double c);
    abstract double calculateTriangleAreaByBaseHeight(double base, double height);
    abstract double calculateSemicircleArea(double radius);
    abstract double calculateSectorArea(double radius, double angle);
}

class GeometryArea extends ShapeArea {

    @Override
    double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    @Override
    double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculateTriangleAreaBySides(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
    }

    @Override
    double calculateTriangleAreaByBaseHeight(double base, double height) {
        return 0.5 * base * height;
    }

    @Override
    double calculateSemicircleArea(double radius) {
        return (Math.PI * Math.pow(radius, 2)) / 2;
    }

    @Override
    double calculateSectorArea(double radius, double angle) {
        return (angle / 360) * Math.PI * Math.pow(radius, 2);
    }

}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ShapeArea findArea = new GeometryArea();
        int choice;
        
        do {

            System.out.println("==== Shape Area Calculation ====");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle (three sides)");
            System.out.println("4. Triangle (base and height)");
            System.out.println("5. Semi circle");
            System.out.println("6. Sector");
            System.out.println("7. Quit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    System.out.println("Area of Rectangle: " + findArea.calculateRectangleArea(width, height));
                    break;
                case 2:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of Circle: " + findArea.calculateCircleArea(radius));
                    break;
                case 3:
                    System.out.print("Enter a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Enter c: ");
                    double c = scanner.nextDouble();
                    System.out.println("The area of Triangle (three sides): " + findArea.calculateTriangleAreaBySides(a, b, c));
                    break;
                case 4:
                    System.out.print("Enter Base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter Height: ");
                    double height2 = scanner.nextDouble();
                    System.out.println("The area of Triangle (Base and Height): " + findArea.calculateTriangleAreaByBaseHeight(base, height2));
                    break;
                case 5:
                    System.out.print("Enter Radius: ");
                    double radius2 = scanner.nextDouble();
                    System.out.println("The area of Semi Circle:" + findArea.calculateSemicircleArea(radius2));
                    break;
                case 6:
                    System.out.print("Enter Radius: ");
                    double radius3 = scanner.nextDouble();
                    System.out.print("Enter Angle: ");
                    double angle = scanner.nextDouble();
                    System.out.println("The area of Sector: " + findArea.calculateSectorArea(radius3, angle));
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid value, please try again...");
                    break;
            }

        } while(choice != 7);

        scanner.close();
    }
}