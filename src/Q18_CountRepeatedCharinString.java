//Count a repeated character from a String array

import java.util.*;

public class Q18_CountRepeatedCharinString {

    public static Map<String, Integer> strArrayCharCount (String[] array, char character) {
        Map<String, Integer> strChrCount = new HashMap<>();

        for (String string: array) {
            char[] chrArray = string.toCharArray();
            int tempCount = 0;

            for (int i = 0; i < chrArray.length-1; i++) {
                if (chrArray[i] == character) {
                    tempCount++;
                }
            }

            strChrCount.put(string, tempCount);
        }

        return strChrCount;
    }

    public static void main(String[] args) {
        String[] array = {"apple", "bat", "car", "den"};
        char chr = 'a';
        System.out.println("'" + chr + "' repeated in array: " + strArrayCharCount(array, chr));
    }
}
