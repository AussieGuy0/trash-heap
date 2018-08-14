/* file name  : coinFlipSim.java
 * created    : Thu 25 Feb 2016 12:42:34 ACDT
 * Author     : AussieGuy0 (Anthony Bruno)
 * modifications:
 *
 */

import java.util.Scanner;

class coinFlipSim {

        public static void main (String args[]) {
            Scanner scan = new Scanner(System.in);            
            System.out.println("Insert number of times to flip coin");
            while (!scan.hasNextInt()) {
                System.out.println("Please print int");
                scan.nextLine();
            }
            int numberOfFlips = scan.nextInt();
            int heads = 0;
            int tails = 0;

            for (int i = 0; i < numberOfFlips; i++) {
                    if (Math.floor(Math.random() * 2) == 0) {
                            heads++;
                    } else {
                            tails++;
                    }
            }

            System.out.println("Results:");
            System.out.println("Heads: "+heads);
            System.out.println("Tails: "+tails);
        }
}
