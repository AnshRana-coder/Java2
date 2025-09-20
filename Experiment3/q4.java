import java.util.*;
public class q4{
    public static void main(String[] args){
        System.out.println("ANSH RANA\n24CSU275");
        System.out.print("Enter an array size and it value");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        scn.close();
        int sum = 0;
        int altsum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
            if(i%2==0){
                altsum += arr[i];
            }
        }
        System.out.println("sum of all element = " + sum);
        System.out.println("sum of alt element = " + altsum);

    }
}