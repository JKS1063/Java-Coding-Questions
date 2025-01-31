//Nth Highest Number in an Array

import java.util.*;

public class Q12_Nth_HighestNumber {

    public static Integer nthHighestNumber(Integer[] array, Integer n) {

        Arrays.sort(array);

        return array[array.length - n];
    }

    public static void main(String[] args) {

        Integer[] array = {32,52,8,62,4,26,25,36};
        Scanner input = new Scanner(System.in);
        System.out.print("Highest Number: ");
        Integer highestNumber = input.nextInt();

        if (highestNumber == 1) {
            System.out.println(highestNumber + "st highest number in array: " + nthHighestNumber(array, highestNumber));
        } else if (highestNumber == 2) {
            System.out.println(highestNumber + "nd highest number in array: " + nthHighestNumber(array, highestNumber));
        } else if (highestNumber == 3) {
            System.out.println(highestNumber + "rd highest number in array: " + nthHighestNumber(array, highestNumber));
        } else {
            System.out.println(highestNumber + "th highest number in array: " + nthHighestNumber(array, highestNumber));
        }
    }
}
