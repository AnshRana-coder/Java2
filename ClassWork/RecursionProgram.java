import java.util.*;

class Recursion {
    String str;
    int num;

    void fibonacci(int n, int a, int b) {
        if (n > 0) {
            System.out.print(a + " ");
            fibonacci(n - 1, b, a + b);
        }
    }
    void fibonacci(int n) {
        System.out.print("Fibonacci Series: ");
        fibonacci(n, 0, 1);
        System.out.println();
    }
    int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    boolean palindrome(String s, int start, int end) {
        if (start >= end)
            return true;
        if (s.charAt(start) != s.charAt(end))
            return false;
        return palindrome(s, start + 1, end - 1);
    }

    boolean palindrome(String s) {
        return palindrome(s, 0, s.length() - 1);
    }

    String reverse(String s) {
        if (s.isEmpty())
            return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
}


public class RecursionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Recursion r = new Recursion();

        System.out.print("Enter an integer: ");
        r.num = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter a string: ");
        r.str = sc.nextLine();

        int choice;
        do {
            System.out.println("1. Fibonacci Series");
            System.out.println("2. Factorial");
            System.out.println("3. Palindrome Check");
            System.out.println("4. Reverse String");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    r.fibonacci(r.num);
                    break;
                case 2:
                    System.out.println("Factorial of " + r.num + " = " + r.factorial(r.num));
                    break;
                case 3:
                    if (r.palindrome(r.str))
                        System.out.println(r.str + " is a Palindrome.");
                    else
                        System.out.println(r.str + " is NOT a Palindrome.");
                    break;
                case 4:
                    System.out.println("Reverse of " + r.str + " = " + r.reverse(r.str));
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
