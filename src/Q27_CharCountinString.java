// Characater counting in a string
// eg. apple output: a:1, p:2, l:1, e:1

import java.util.*;

public class Q27_CharCountinString {

    public static Map<String, Integer> charCountinString(String string) {
        string = string.toLowerCase();
        String newString = string.replaceAll("\\s+", "");
        char[] chrArr = newString.toCharArray();
        Map<String, Integer> chrMap = new HashMap<>();

        for(int i = 0; i <= chrArr.length-1; i++) {
            Integer tempCount = 0;
            for(int j = 0; j <= chrArr.length-1; j++) {
                if(chrArr[i] == chrArr[j]) {
                    tempCount++;
                }
            }

            chrMap.put(String.valueOf(chrArr[i]), tempCount);
        }

        return chrMap;
    }

    public static void main(String[] args) {
        String str = "Jaya Krishna";
        System.out.println(charCountinString(str));
    }
}
