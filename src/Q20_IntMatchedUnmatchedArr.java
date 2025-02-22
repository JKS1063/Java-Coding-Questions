// Print Matched and Unmatched Integers from given two arrays

import java.util.*;

public class Q20_IntMatchedUnmatchedArr {

    public static void main(String[] args) {
        Integer[] arr1 = {8,3,0,4,2,6}, arr2 = {7,6,3,8,5,1,4,0,9};

        List<Integer> fullArr = new ArrayList<>(Arrays.asList(arr1));
        fullArr.addAll(Arrays.asList(arr2));

        Set<Integer> matchedArr  = new HashSet<>();
        Set<Integer> unmatchedArr = new HashSet<>();

        for (int i = 0; i <= fullArr.size()-1; i++) {
            int tempCount = 0;
            for (int j = 0; j <= fullArr.size()-1; j++) {

                if (fullArr.get(i) == fullArr.get(j)) {
                    tempCount++;
                }
            }
            if (tempCount > 1) {
                matchedArr.add(fullArr.get(i));
            } else {
                unmatchedArr.add(fullArr.get(i));
            }
        }

        System.out.println("Matched Array: " + matchedArr);
        System.out.println("Unmatched Array: " + unmatchedArr);
    }
}
