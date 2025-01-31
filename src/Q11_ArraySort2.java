//Array sort

import java.util.*;

public class Q11_ArraySort2 {

    public static List<Integer> arraySort(Integer[] array) {

        Arrays.sort(array);

        return Arrays.asList(array);
    }

    public static void main(String[] args) {
        Integer[] array = {32,52,8,62,4,26,25,36};

        System.out.println("Sorted Array: " + arraySort(array));
    }
}
