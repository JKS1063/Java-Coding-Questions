import java.util.*;

public class Q8_ReveseLetterCase {

    public static String reverseLetterCase(String string) {

        String lowCase = string.toLowerCase();
        String highCase = string.toUpperCase();
        String reverseCase = "";

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == lowCase.charAt(i)) {
                reverseCase += highCase.charAt(i);
            } else {
                reverseCase += lowCase.charAt(i);
            }
        }

        return reverseCase;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = input.nextLine();

        System.out.println("Reverse Casing for '" + string +  "' is: " + reverseLetterCase(string));
    }
}
