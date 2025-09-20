import java.util.*;

public class q1 {
    public static void main(String[] args) {
        System.out.println("ANSH RANA\n24CSU275");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a b c ");

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float d = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("not a qyadratic");
        } 
        else if (d > 0) {
            float root1 = (-b + (float)Math.sqrt(d)) / (2 * a);
            float root2 = (-b - (float)Math.sqrt(d)) / (2 * a);
            System.out.println("real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } 
        else if (d == 0) {
            float root = -b / (2 * a);
            System.out.println("equal roots:");
            System.out.println("Root = " + root);
        } 
        else {
            float realPart = -b / (2 * a);
            float imaginaryPart = (float)Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are complex:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }

        sc.close();
    }
}
