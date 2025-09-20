import java.util.*;
public class q2{
	public static void main(String[] args){
		System.out.println("ANSH RANA\n24CSU275");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the minutes");
		int minutes = scn.nextInt();
	    int years = minutes / (60*24*365);
	    int months = (minutes / (60*24*30)) % 12;
	    int days = (minutes / (60*24)) % 30;
	    System.out.println(minutes+" minutes = "+years+" years "+months+" months "+days+" days");
		scn.close();
	}
}