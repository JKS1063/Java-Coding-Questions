//Print even numbers from an Array

import java.util.ArrayList;
import java.util.List;

public class Q15_EvenNumbers {

    public static List<Integer> evenNumbers(Integer[] array) {

        List<Integer> evenArray = new ArrayList<>();

        for (Integer number: array) {
            if (number %2 == 0) {
                evenArray.add(number);
            }
        }

        return evenArray;
    }

    public static void main(String[] args) {
        Integer[] array = {42,5,63,8,41,58,63,15,47};

        System.out.println("Even number in array: " + evenNumbers(array));
    }
}
