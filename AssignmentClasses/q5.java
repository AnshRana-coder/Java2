abstract class Shape {
    abstract double getArea();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class q5 {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(5, 3);
        Shape s2 = new Circle(4);

        System.out.println("Rectangle Area: " + s1.getArea());
        System.out.println("Circle Area: " + s2.getArea());
    }
}
