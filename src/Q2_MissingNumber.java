//Find the missing number in an array?

public class Q2_MissingNumber {
    public static void main(String[] args) {

        int[] numArray = {1,2,3,4,5,6,8};

        for (int i = 0; i < numArray.length - 1; i++) {
            int difference = numArray[i+1] - numArray[i];

            if (difference != 1) {
                int missingNumber = numArray[i] + 1;
                System.out.println("Missing number:" + missingNumber);
            }
        }
    }
}
