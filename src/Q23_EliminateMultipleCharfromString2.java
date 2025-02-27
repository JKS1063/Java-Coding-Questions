// Eliminate multiple occured characters in the given string without using collections

public class Q23_EliminateMultipleCharfromString2 {

    public static String eliminateMultipleCharfromString(String string) {
        String newName = "";
        char[] charArr = string.toCharArray();

        for (int i = 0; i < charArr.length-1; i++) {
            int tempCount = 0;
            for (int j = 0; j < charArr.length-1; j++) {
                if(charArr[i] == charArr[j]) {
                    tempCount++;
                }
            }

            if (tempCount < 2) {
                newName += charArr[i];
            }
        }

        return newName;
    }

    public static void main(String[] args) {
        String name = "jayakrishnasekhar";
        System.out.println(eliminateMultipleCharfromString(name));
    }
}
