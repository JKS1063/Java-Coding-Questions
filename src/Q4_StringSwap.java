//Write a java program to swap two string variables without using temp variable?

public class Q4_StringSwap {
    public static void main(String[] args) {

        String a = "Hello";
        String b = "World";

        System.out.println("Original Strings");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a = a+b;

        b = a.substring(0, a.indexOf('o')+1);
        a = a.substring(a.indexOf('W'), a.length());

        System.out.println("Swapped strings");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
