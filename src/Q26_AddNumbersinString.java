// Add numbers in a given string
// eg. jaya12krishna15 output: 27

import java.util.*;

public class Q26_AddNumbersinString {

    public static Integer addNumbersinString(String string) {
        String newStr = string.replaceAll("[a-zA-Z]", " ");
        String[] strArr = newStr.split(" ");
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i <= strArr.length-1; i++) {

            if(!strArr[i].isEmpty()) {
                Integer number = Integer.parseInt(strArr[i]);
                nums.add(number);
            }
        }

        Integer sum = 0;
        for (Integer num: nums) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        String string = "jaya12krishna15";
        System.out.println(addNumbersinString(string));
    }
}
