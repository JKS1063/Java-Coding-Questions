// print a string in the following pattern
// n
// na
// nam
// name

public class Q24_PatternPrint {

    public static void patternPrint(String string) {

        for (int i = 0; i <= string.length(); i++) {
            System.out.println(string.substring(0,i));
        }
    }

    public static void main(String[] args) {
        String name = "Krishna";
        patternPrint(name);
    }
}
