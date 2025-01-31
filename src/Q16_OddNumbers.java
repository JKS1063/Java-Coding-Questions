//Print Odd numbers

import java.util.ArrayList;
import java.util.List;

public class Q16_OddNumbers {

    public static List<Integer> oddNumbers(Integer[] array) {
        List<Integer> oddArray = new ArrayList<>();

        for (Integer number: array) {
            if (number %2 != 0) {
                oddArray.add(number);
            }
        }

        return oddArray;
    }

    public static void main(String[] args) {
        Integer[] array = {42,5,63,8,41,58,63,15,47};

        System.out.println("Odd numbers in Array: " + oddNumbers(array));
    }
}
