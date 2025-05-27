package Lab04.Ex7;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void displayPoint() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

class Line extends Point {
    Point end;

    Line(int x1, int y1, int x2, int y2) {
        super(x1, y1); 
        this.end = new Point(x2, y2);
    }

    void displayLine() {
        displayPoint();
        System.out.println("Line: Start(" + x + ", " + y + "), End(" + end.x + ", " + end.y + ")");
    }
}

class Triangle extends Line {
    Point thirdPoint;

    Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, x2, y2); 
        this.thirdPoint = new Point(x3, y3);
    }

    void displayTriangle() {
        displayLine(); 
        System.out.println("Third Point: (" + thirdPoint.x + ", " + thirdPoint.y + ")");
    }
}

class Rectangle extends Triangle {
    Point fourthPoint;

    Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3);
        this.fourthPoint = new Point(x4, y4);
    }

    public void displayRectangle() {
        displayTriangle();
        System.out.println("Fourth Point: (" + fourthPoint.x + ", " + fourthPoint.y + ")");
    }
}

public class MyMath {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(0, 0, 4, 0, 4, 3, 0, 3);
        r.displayRectangle();
    }
}

