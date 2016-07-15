/*
 * CountVowels.java
 * Copyright (C) 2016 anthony <anthony@Anthony-PC>
 *
 * Distributed under terms of the MIT license.
 */
import java.util.Scanner;
public class CountVowels
{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert string to count vowels");
        String inputString = in.nextLine();
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int j = 0; j < inputString.length(); j++) {
            char currentChar = inputString.charAt(j);
            switch(currentChar) {
                case 'a':
                case 'A': a++;
                        break;
                case 'e':
                case 'E': e++;
                        break;
                case 'i':
                case 'I': i++;
                        break;
                case 'o':
                case 'O': o++;
                        break;
                case 'u':
                case 'U': u++;
                        break;
            }
        }

        System.out.println("Final tally:");
        System.out.println("a: "+a+", e: "+e+", i: "+i+", o: "+o+", u: "+u);
	}
}

