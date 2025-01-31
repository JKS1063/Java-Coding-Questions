// Write a function to find out duplicate words in a given string?

import java.util.*;

public class Q1_DuplicateWords {
    public static void main(String[] args) {
       String string = "Big black bug bit a big black dog on his big black nose";
       string = string.toLowerCase();

       String[] wordArray = string.split(" ");
       Set<String> duplicates = new HashSet<>();

       for (int i = 0; i < wordArray.length; i++) {
           int count = 0;

           for (int j = 0; j < wordArray.length; j++) {
               if (wordArray[i].equals(wordArray[j])) {
                   count++;
               }
           }

           if (count > 1) {
               duplicates.add(wordArray[i] + ":" + count);
           }
       }

        System.out.println("Duplicate words: " + duplicates);
    }
}