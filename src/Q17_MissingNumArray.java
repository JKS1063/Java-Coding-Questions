// Find the missing numbers in an array

import java.util.*;

public class Q17_MissingNumArray {

    public static List<Integer> missingNumArray(Integer[] numArray) {

        List<Integer> missingNumbers = new ArrayList<>();

        for (int i = 0; i < numArray.length-1; i++) {

            Integer difference = numArray[i+1] -  numArray[i];

            if (difference != 1) {
                for (int j = numArray[i]; j < numArray[i+1]-1; j++) {
                    Integer missingNum = j+1;
                    missingNumbers.add(missingNum);
                }
            }
        }

        return missingNumbers;
    }

    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,6,8,12,15};

        System.out.println("Missing numbers in the given array '" + Arrays.toString(array) +"': " + missingNumArray(array));
    }
}
