import java.util.*;

public class q3{
    public static void main(String[] args) {
        System.out.println("ANSH RANA\n24CSU275");
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a pattern to");
        System.out.println("pyramid");
        System.out.println("left triangle");
        System.out.println("right triangle");
        System.out.println("rhombus");
        System.out.print("Enter your choice 1 to 4: ");

        int choice = sc.nextInt();

        System.out.print("Enter number of * : ");
        int n = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 1; i <= n; i++) {
                    for (int j = i; j < n; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= (2 * i - 1); j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 2:
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 3:
                for (int i = 1; i <= n; i++) {
                    for (int j = i; j < n; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 4: // Rhombus
                for (int i = 1; i <= n; i++) {
                    for (int j = i; j < n; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= n; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("no, choose 1 to 4");
        }

        sc.close();
    }
}
