package Lab.Arrays;

import java.util.Scanner;

public class P5EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        int[] numsArr = new int[inputArr.length];

        for (int i = 0; i < numsArr.length; i++) {
            numsArr[i] = Integer.parseInt(inputArr[i]);
        }
        int evenSum = 0;
        int oddSum = 0;
        for (int num : numsArr) {
            if (num % 2 == 0) {
                evenSum += num ;
            } else {
                oddSum += num;
            }

        }
        int totalSum = evenSum - oddSum;
        System.out.println(totalSum);
    }

}



