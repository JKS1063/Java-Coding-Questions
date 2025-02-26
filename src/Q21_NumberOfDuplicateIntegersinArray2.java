import java.util.*;


// This class finds the number of duplicate integers in the given array
public class Q21_NumberOfDuplicateIntegersinArray2 {

    // Method to calculate the number of duplicate integers in an array
    public static Integer numberOfDuplicateIntegers(int[] array) {

        int duplicateCount = 0; // Initialize duplicate count
        Set<Integer> duplicates = new HashSet<>(); // Set to track unique numbers

        // Iterate through each number in the array
        for (Integer num : array) {
            // If number is already in the set, it's a duplicate
            if (!duplicates.add(num)) {
                duplicateCount++; // Increment duplicate count
            }
        }
        return duplicateCount; // Return the total number of duplicates found
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int[] array = {0, -2, -2, 5, 5, 5}; // Sample array with duplicates
        System.out.println(numberOfDuplicateIntegers(array)); // Print the result
    }
}

