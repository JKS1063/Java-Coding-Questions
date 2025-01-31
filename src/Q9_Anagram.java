//An anagram is a word or phrase made by transposing the letters of another word or phrase.
//Example: The word "secure" is an anagram of "rescue."

import java.util.*;

public class Q9_Anagram {

    public static boolean isAnagram(String str1, String str2) {

        char[] str1Arr = str1.toLowerCase().toCharArray();
        char[] str2Arr = str2.toLowerCase().toCharArray();

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        return Arrays.equals(str1Arr, str2Arr);
    }

    public static void main(String[] args) {

        String str1 = "Rescue";
        String str2 = "Secure";

        System.out.println("'"+str1 + "' is an Anagram: " + isAnagram(str1, str2));
    }

}
