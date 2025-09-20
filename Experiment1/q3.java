import java.util.*;
public class q3{
	public static void main(String[] args){
		System.out.println("ANSH RANA\n24CSU275");

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        float fahrenheit = sc.nextFloat();

        float celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(celsius + "°C");
        

        sc.close();
	}
}