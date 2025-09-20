import java.util.*;
public class q5{
	public static void main(String[] args){
		System.out.println("ANSH RANA\n24CSU275");

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int a = num / 100;     
        int b = (num / 10) % 10;      
        int c = num % 10;            

        int reversed = c * 100 + b * 10 + a;

        System.out.println("Reversed number = " + reversed);

        sc.close();
	}
}