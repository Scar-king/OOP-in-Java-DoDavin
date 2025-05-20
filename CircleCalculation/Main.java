package CircleCalculation;

public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(2.5);
        System.out.println(circle2);

        Circle circle3 = new Circle();
        circle3.setRadius(5);
        circle3.setColor("Blue");
        System.out.println(circle3);

        // Ex2 for Circle
        Circle circle4 = new Circle();
        Circle circle5 = new Circle(2);

        System.out.println("Radius 4: " + circle4.getRadius());
        System.out.println("Area 4: " + circle4.getArea());
        System.out.println("Radius 5: " + circle5.getRadius());
        System.out.println("Area 5: " + circle5.getArea());

        // Ex3 for Circle
        Circle circle6 = new Circle(2.5, "Gold");
        System.out.println(circle6);
        System.out.println("Area: " + circle6.getArea() + "m^2");
        System.out.println("Circumference: " + circle6.getCircumference() + "m");
        
    }
}