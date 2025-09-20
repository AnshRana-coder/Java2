import java.util.Scanner;

class Area {
    double length, breadth;
    Area(double l, double b) {
        length = l;
        breadth = b;
    }
    double returnArea() {
        return length * breadth;
    }
}

public class q3 {
    public static void main(String[] args) {
        System.out.println("ANSH RANA\n24CSU275");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        Area rect = new Area(l, b);
        System.out.println("Area of Rectangle: " + rect.returnArea());
    }
}
