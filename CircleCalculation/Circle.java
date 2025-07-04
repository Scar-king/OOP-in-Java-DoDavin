package CircleCalculation;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    // Add new Features
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Circle[radius=" + radius + ", color=" + color +"]";
    }
}
