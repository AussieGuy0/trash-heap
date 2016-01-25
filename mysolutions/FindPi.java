import java.lang.Math;
import java.util.Scanner;

public class FindPi {
	
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter integer to find that many digits of pi");
		
		int places = scan.nextInt();
		
		//Next line isn't outputting pi for some reason
		double pi = (20 * Math.atan(1/7)) + (8 * Math.atan(3/79));
		
		System.out.printf("%."+places+"f",pi);
		
		
		
	}
}

