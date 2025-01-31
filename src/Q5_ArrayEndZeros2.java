//Write a java program to Move all zeroes to end of array?

import java.util.*;

public class Q5_ArrayEndZeros2 {

    public static List<Integer> pushZerostoEnd(Integer[] array){

        List<Integer> zerosEndList = new ArrayList<>();

        for (Integer number: array) {
            if (number != 0) {
                zerosEndList.add(number);
            }
        }

        for (Integer number: array) {
            if (number == 0) {
                zerosEndList.add(number);
            }
        }

        return zerosEndList;
    }

    public static void main(String[] args) {

        Integer[] array = {1,2,0,4,3,0,5,0};

        System.out.println("Sorted Array: " + pushZerostoEnd(array));
    }
}
