// Find how many duplicate Integers are there in the given array
// Eg. new int[] {0,-2,-2,5,5,5} output: 3
import java.util.*;

public class Q21_NumberOfDuplicateIntegersinArray {

    public static Integer numberOfDuplicateIntegers(int[] array) {

        Map<Integer, Integer> duplicatesMap = new HashMap<>();

        for (int i = 0; i <= array.length-1; i++) {
            int tempCount = 0;
            for (int j = 0; j <= array.length-1; j++) {
                if (array[i] == array[j]) {
                    tempCount++;

                }
            }
            if (tempCount > 1) {
                duplicatesMap.put(array[i], tempCount-1);
            }
        }

        List<Integer> duplicatesList = new ArrayList<>(duplicatesMap.values());
        Integer duplicates = 0;

        for (int i = 0; i <= duplicatesList.size()-1; i++) {
            duplicates += duplicatesList.get(i);
        }
        return duplicates;

    }

    public static void main(String[] args) {
        int[] array = {0,-2,-2,5,5,5};
        System.out.println(numberOfDuplicateIntegers(array));
    }
}
