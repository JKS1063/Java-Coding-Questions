// Write a program to generate random number between the given range?

import java.util.*;

public class Q3_RandomNumber1 {
    public static void main(String[] args) {

        int min = 1;
        int max = 100;

        Random random = new Random();

        int randomNum = random.nextInt((max - min) + 1) + min;

        System.out.println("Random value between " + min + " and " + max + " is: " + randomNum);

    }
}
