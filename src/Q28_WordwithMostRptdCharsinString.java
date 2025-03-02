// Find the word with most repeated characters in the given string
// Eg. Hello apple pie output: Hello

import java.util.*;

public class Q28_WordwithMostRptdCharsinString {

    public static String wordwithMostRptdCharsinString (String string) {
        String[] strArr = string.split(" ");
        Map<String, Integer> wordMap = new TreeMap<>();

        for (String word: strArr) {
            char[] chrArr = word.toCharArray();
            Map<Character, Integer> duplicates = new HashMap<>();

            for (int i = 0; i < chrArr.length; i++) {
               int duplicateCount = 0;
               for (int j = 0; j < chrArr.length; j++) {
                   if (chrArr[i] == chrArr[j]) {
                       duplicateCount++;
                   }
               }
               if (duplicateCount > 1) {
                  duplicates.put(chrArr[i], duplicateCount);
               }
            }

            Integer count = 0;
            List<Integer> values = new ArrayList<>(duplicates.values());
            for (int i = 0; i < duplicates.size(); i++) {
                count += values.get(i);
            }

            if (count > 0) {
                wordMap.put(word, count);
            } else  {
                wordMap.put(word, -1);
            }
        }
            List<String> keys = new LinkedList<>(wordMap.keySet());

        return keys.get(0);
    }

    public static void main(String[] args) {
        String str = "Hello apple pie";
        System.out.println(wordwithMostRptdCharsinString(str));
    }
}
