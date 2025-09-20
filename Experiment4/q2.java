import java.util.*;
class q2 {
    int a, b, c;

    q2() {
        a = 3;
        b = 4;
        c = 5;
    }

    void printAreaAndPerimeter() {
        int perimeter = a + b + c;
        double s = perimeter / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
    System.out.println("ANSH RANA\n24CSU275");
        q2 t = new q2();
        t.printAreaAndPerimeter();
    }
}
