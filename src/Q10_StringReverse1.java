//Reverse a string without using any method

import java.util.*;

public class Q10_StringReverse1 {

    public static String stringReverse(String string) {

        String revString = "";

        for (int i  = string.length() - 1; i >= 0; i--) {
            revString = revString + string.charAt(i);
        }

        return revString;
    }

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = input.nextLine();

        System.out.println("Reversed String: " + stringReverse(string));
    }
}
