// Find number of anagrams in the given array
//Eg. {"aa", "aa", "odg", "dog", "god"}

import java.util.*;

public class Q22_NumberOfAnagramsinArray {

    public static Integer numberOfAnagramsinArray(String[] array) {

        List<String> strsList = new ArrayList<>();
        for (int i = 0; i <= array.length-1; i++) {
            String[] strs = array[i].split("");
            Arrays.sort(strs);
            strsList.add(String.join("", strs));
        }

        Set<String> duplicates = new HashSet<>();
        Integer duplicateCount = 0;

        for (String string: strsList) {
            if (!duplicates.add(string)) {
                duplicateCount++;
            }
        }

        return duplicateCount;
    }

    public static void main(String[] args) {
        String[] array = {"aa", "aa", "odg", "dog", "god"};
        System.out.println(numberOfAnagramsinArray(array));
    }

}
