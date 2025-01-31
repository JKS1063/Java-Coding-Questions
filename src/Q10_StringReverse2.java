//Reverse a string

import java.util.Scanner;

public class Q10_StringReverse2 {

    public static String stringReverse(String string) {

        StringBuilder sb = new StringBuilder(string);

        sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = input.nextLine();

        System.out.println("Reversed string: " + stringReverse(string));
    }
}
