//Write a java program to Move all zeroes to end of array?

import java.util.*;

public class Q5_ArrayEndZeros1 {

    public static void pushZerostoEnd(int[] array, int arrayLength) {

        int right = 0, left = 0;

        while (right < arrayLength) {
            if (array[right] != 0) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
            }
            right++;
        }
    }

    public static void main(String[] args) {

        int[] array = {1,2,0,4,3,0,5,0};
        int n = array.length;

        pushZerostoEnd(array, n);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
