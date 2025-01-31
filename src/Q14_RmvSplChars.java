//Remove special Characters from string

import java.util.Scanner;

public class Q14_RmvSplChars {

    public static String removeSpecialChars(String string) {
        return string.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = input.nextLine();

        System.out.println("String without Special Characters: " + removeSpecialChars(string));
    }
}
