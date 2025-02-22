// Reverse the string and print the repetitive characters

import java.util.*;

public class Q19_StrRevRepChrCount {

    public static void main(String[] args) {
        String name = "JayaKrishnaSekhar";
        name = name.toLowerCase();
        StringBuilder sb = new StringBuilder(name);
        String revName = sb.reverse().toString();

        System.out.println("Name:" + name);
        System.out.println("Reverse Name: " + revName);

        Map<String, Integer> charCount = new HashMap<>();
        char[] chars = revName.toCharArray();

        for (int i = 0; i <= chars.length-1; i++) {
            int tempCount = 0;
            for (int j = 0; j <= chars.length-1; j++) {
                if (chars[i] == chars[j]) {
                    tempCount++;
                }
            }

            if (tempCount > 1) {
                charCount.put(String.valueOf(chars[i]), tempCount);
            }
        }

        System.out.println("Repetitive Characters: " + charCount);
    }
}
