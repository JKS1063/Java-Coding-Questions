//Print only special Charaters from the string

import java.util.Scanner;

public class Q13_PrntSplChars {

    public static String printSpecialCharacters(String string){
        return string.replaceAll("[a-zA-Z0-9]", "");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = input.nextLine();

        System.out.println("Special Characters: " + printSpecialCharacters(string));
    }
}
