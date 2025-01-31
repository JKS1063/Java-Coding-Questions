import java.util.*;

public class Q6_Palindrome {

    public static boolean isPalindrome(String string) {

        StringBuilder sb = new StringBuilder(string).reverse();

        if (string.equalsIgnoreCase(sb.toString())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a String: ");
        String string = input.next();

        System.out.println("Given '" + string + "' is a Palindrome: " + isPalindrome(string));
    }
}
