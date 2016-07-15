import java.util.Scanner;

public class Palindrone{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string to reverse");
        String inputString = in.nextLine();

        StringBuilder builder = new StringBuilder();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            builder.append(inputString.charAt(i));
        }

        if (builder.toString().equals(inputString)) {
            System.out.println(inputString + " is a palindrone");
        } else {
            System.out.println(inputString + " is not a palindrone");
        }
    }
}
