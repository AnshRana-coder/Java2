import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        System.out.println("ANSH RANA\n24CSU275");
        System.out.print("Enter an array size and it value");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        System.out.print("Enter the number to find: ");
        int x = scn.nextInt();
        scn.close();

        boolean found = false;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("Element is at index " + index);
        } else {
            System.out.println("Element  does not exist in the array.");
        }
    }
}
