// Eliminate multiple occured characters from the given string
// Eg. jayakrishnasekhar output: jyrine

import java.util.*;

public class Q23_EliminateMultipleCharfromString {

    public static String elimiateMultipleCharsfromString(String string) {
        List<String> singleCharArr = new ArrayList<>();
        char[] charArr = string.toCharArray();

        for (int i = 0; i < charArr.length-1; i++) {
            int tempCount = 0;
            for (int j = 0; j < charArr.length-1; j++){
                if (charArr[i] ==  charArr[j]) {
                    tempCount++;
                }
            }
            if(tempCount < 2) {
                singleCharArr.add(String.valueOf(charArr[i]));
            }
        }

        return String.join("", singleCharArr);
    }

    public static void main(String[] args) {
        String string = "jayakrishnasekhar";
        System.out.println(elimiateMultipleCharsfromString(string));
    }
 }
