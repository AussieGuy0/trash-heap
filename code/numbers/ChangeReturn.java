import java.util.Scanner;

class ChangeReturn {
       	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insert cost");
		System.out.print("$");
		double cost = scan.nextDouble();
		
		System.out.println("Insert Amount Given");
		System.out.print("$");
		double amount = scan.nextDouble();

		double diffrence = amount - cost;
		double change = diffrence;
		int twoDollar = 0, oneDollar = 0, fiftyCent = 0, twentyCent = 0, tenCent = 0, fiveCent = 0;
		while (diffrence > 0.04) {
			if (diffrence >= 2) {
				twoDollar++;
				diffrence -= 2;
			} else if (diffrence >= 1) {
				oneDollar++;
				diffrence -= 1;
			} else if (diffrence >= 0.5) {
				fiftyCent++;
				diffrence -= 0.5;
			} else if (diffrence >= 0.2) {
				twentyCent++;
				diffrence -= 0.2;
			} else if (diffrence >= 0.10) {
				tenCent++;
				diffrence -= 0.1;
			} else {
				fiveCent++;
				diffrence -= 0.05;
			}
			

		}
		change = change - diffrence;
		System.out.println("Your change is: $"+ change);
		System.out.println("Made by: "+ twoDollar +" Two Dollar Coins, " + oneDollar +" One Dollar Coins, "
				  + fiftyCent + " Fifty Cent Coins, " + twentyCent + " Twenty Cent Coins, " + tenCent + " Ten Cent Coins and " + 
				  fiveCent + " Five Cent Coins");
	}

}
