import java.util.*;
public class q5 {

    public static void reverse(int arr[]){
        int left=0;
        int right= arr.length-1;
        int x=0;
        while(left<right){
            x=arr[left];
            arr[left]=arr[right];
            arr[right]=x;
            left++;
            right--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
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
        reverse(arr);
        
    }
}
