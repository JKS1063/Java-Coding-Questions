// Print list of Fibonacci numbers until given input number
// Eg. input = 9, output: 0,1,1,3,5,8

import java.util.*;

public class Q29_FibonacciSeries {

    public static List<Integer> fiboNums(int number) {

        int a = 0;
        int b = 1;

        List<Integer> fiboList = new ArrayList<>();

        for (int i = 0; i <= number; i++) {
            fiboList.add(a);
            int temp = b;
            b = b + a;
            a = temp;

            if (a >= number) {
                break;
            }
        }

        return fiboList;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = input.nextInt();

        System.out.println("Fibonacci Series: " + fiboNums(number));
    }
}
