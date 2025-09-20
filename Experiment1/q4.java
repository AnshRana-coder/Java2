import java.util.*;
public class q4{
	public static void main(String[] args){
		System.out.println("ANSH RANA\n24CSU275");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int a = num / 100;       
        int b = (num / 10) % 10;       
        int c = num % 10;              

        int sum = a + b + c;

        System.out.println("Sum of digits of " + num + " = " + sum);

        sc.close();
	}
}