import java.util.Scanner;

public class ReverseString {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert string to see if palindrone");
        String inputString = in.nextLine();

        StringBuilder builder = new StringBuilder();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            builder.append(inputString.charAt(i));
        }

        System.out.println("Reversed string: " + builder.toString());
    }
}
