import java.util.*;

public class Q7_ArmstrongNumber {

    public static boolean isArmstrongNumber(int number) {

        int actualNumber = number;
        double result = 0;

        while (actualNumber != 0) {
            int n = actualNumber % 10;
            result += Math.pow(n, 3);
            actualNumber /= 10;
        }

        if (result == number) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();

        System.out.println("Given '" + number + "' is an Armstrong number: " + isArmstrongNumber(number));
    }
}
