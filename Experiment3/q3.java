import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ANSH RANA\n24CSU275");
        System.out.print("Enter an array size and it value");

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[oddCount];

        int e = 0, o = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                evenArr[e++] = arr[i];
            else
                oddArr[o++] = arr[i];
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < evenArr.length; i++) {
            System.out.print(evenArr[i] + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int i = 0; i < oddArr.length; i++) {
            System.out.print(oddArr[i] + " ");
        }

        sc.close();
    }
}
