import java.util.*;

public class q6{
    public static void main(String[] args) {
        System.out.println("ANSH RANA\n24CSU275");
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " array eleme nts:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        int newLength = 0;
        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < newLength; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                arr[newLength] = arr[i];
                newLength++;
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
