package Lab05.Ex3;

public class Shape {
    public void display() {
        System.out.println("Generic Shape");
    }
}

class Line extends Shape {
    int length;

    public Line(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("_");
        }
        return sb.toString();
    }
}

class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Width: " + width + ", Height: " + height + "\n");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

class Triangle extends Shape {
    int height;

    public Triangle(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Height: " + height + "\n");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}