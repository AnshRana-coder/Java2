import java.util.*;

public class q5{
    public static void main(String[] args) {
        System.out.println("ANSH RANA\n24CSU275");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c;

        System.out.println("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}
