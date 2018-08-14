import java.util.Scanner;
import java.util.InputMismatchException;

public class Fibonacci {
	
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter integer to find nth digit of the Fibonacci Sequence");
		
		int digit = 0; //Used to determine how much numbers to calculate
		
		/* Scans for next int input. If invalid input, shows a error message
		 * and waits for next input */
		do {
			try {
			digit = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Invalid value entered! Try again");
		}
		scan.nextLine(); //clears buffer
		} while (digit <= 0);
		
		
	    long firstNum = 1;
		long secondNum = 1;
		
		if (digit == 1) {
			System.out.print(firstNum);
		} else {
			System.out.print(firstNum+","+secondNum);
		}
		
		for (int i = 0; i < digit-2; i++) {
			long nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;
			
			if (nextNum < 0) { //If number overflows, displays error and stops loop
				System.out.println("\nNumber is too big! Overflow Error");
				break;
			}
			System.out.print(","+secondNum);
		}
		System.out.println("");
	}
}

