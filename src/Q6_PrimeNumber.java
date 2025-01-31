import java.util.*;

public class Q6_PrimeNumber {

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        } else {

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();

        System.out.println("Given '" + number + "' is a prime number: " + isPrime(number));
    }
}
