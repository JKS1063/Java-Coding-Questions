// Replace first and last words in given string
// eg. my name is jaya output: jaya is name my

import java.util.*;

public class Q25_ReplaceFirstLastWordsinString {

    public static String replaceFirstLastWordsinString(String string) {
        String[] strArr = string.split(" ");
        List<String> strList = new ArrayList<>();

        for (int i = 0; i <= strArr.length-1; i++) {

            if (strArr[i] == strArr[0]) {
                strList.add(strArr[strArr.length-1]);
            } else if (strArr[i] == strArr[strArr.length-1]) {
                strList.add(strArr[0]);
            } else {
                strList.add(strArr[i]);
            }
        }

        return String.join(" ", strList);
    }

    public static void main(String[] args) {
        String string = "my name is JayaKrishna";
        System.out.println(replaceFirstLastWordsinString(string));
    }
}
