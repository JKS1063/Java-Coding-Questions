//Sort an array without using any methods

import java.util.*;

public class Q11_ArraySort1 {

    public static String arraySort(int[] intArr) {

        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = 0; j < intArr.length - i - 1; j++) {

                if (intArr[j] >= intArr[j+1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j+1];
                    intArr[j+1] = temp;
                }
            }
        }

        return Arrays.toString(intArr);
    }

    public static void main(String[] args) {
        int[] array = {32,52,8,62,4,26,25,36};

        System.out.println("Sorted Array: " + arraySort(array));
    }
}
