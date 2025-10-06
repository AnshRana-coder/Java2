interface GeometricObject {
    double getPerimeter();
    double getArea();
}

interface Resizable {
    void resize(int percent);
}

class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}

class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius += radius * percent / 100.0;
    }

    @Override
    public String toString() {
        return "ResizableCircle[radius=" + radius + "]";
    }
}

public class q2 {
    public static void main(String[] args) {
        System.out.println("ANSH RANA\n24CSU275");
        Circle circle = new Circle(5.0);
        System.out.println("\"" + circle + "\""); 
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());

        ResizableCircle resizableCircle = new ResizableCircle(5.0);
        System.out.println("\n" + resizableCircle);

        resizableCircle.resize(20); 
        System.out.println("After resizing by 20%: " + resizableCircle);
        System.out.println("Radius: " + resizableCircle.radius);
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());
    }
}
