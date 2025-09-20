import java.util.*;
public class q1{
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
        int max = arr[0];
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
        	if(arr[i]>max){
        		max=arr[i];
        	}
        	if(arr[i]<min){
        		min=arr[i];
        	}
        }
        System.out.println("Max element = " + max);
        System.out.println("Min element = " + min);

	}
}