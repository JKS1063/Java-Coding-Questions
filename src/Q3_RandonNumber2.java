// Write a program to generate random number between the given range?

public class Q3_RandonNumber2 {

    public static void main(String[] args) {

        int min = 1;
        int max = 100;

        int randomNum = (int) (Math.random() * ((max - min) + 1)) + min;

        System.out.println("Random number between " + min + " and " + max + " is: " + randomNum);
    }
}
